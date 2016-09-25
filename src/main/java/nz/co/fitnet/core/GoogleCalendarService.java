package nz.co.fitnet.core;

import static org.glassfish.jersey.client.JerseyClientBuilder.createClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import nz.co.fitnet.api.AccountToken;
import nz.co.fitnet.api.Calendar;
import nz.co.fitnet.api.CalendarList;
import nz.co.fitnet.api.CalendarListEntry;
import nz.co.fitnet.api.Events;
import nz.co.fitnet.jdbi.AccountTokenDAO;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.log4j.Logger;
import org.glassfish.jersey.client.JerseyClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeRequestUrl;
import com.google.api.services.calendar.CalendarScopes;
import com.google.common.hash.HashCode;

public class GoogleCalendarService {
	private static final Logger LOGGER = Logger.getLogger(GoogleCalendarService.class);

	private final GoogleConfig config;
	private final AccountTokenDAO tokenDAO;
	private final HttpClient googleClient;

	public GoogleCalendarService(final GoogleConfig config, final AccountTokenDAO tokenDAO,
			final HttpClient googleClient) {
		super();
		this.config = config;
		this.tokenDAO = tokenDAO;
		this.googleClient = googleClient;
	}

	private String getClientId() {
		return config.getClientId();
	}

	private String getClientSecret() {
		return config.getClientSecret();
	}

	private String tokenURL() {
		return "https://accounts.google.com/o/oauth2/token";
	}

	private String authorizeURL() {
		return "https://accounts.google.com/o/oauth2/auth";
	}

	public URI getAuthorizeURIForService(final URI redirectUri) {
		final String state = HashCode.fromLong(System.currentTimeMillis()).toString();
		final String template = new GoogleAuthorizationCodeRequestUrl(authorizeURL(), getClientId(),
				redirectUri.toString(), Arrays.asList(CalendarScopes.CALENDAR_READONLY)).setState(state).build();
		final URI url = UriBuilder.fromUri(template).build();
		return url;
	}

	public AccountToken getAccessToken(final String code, final String state, final URI redirectUri) {
		final JerseyClient client = createClient();
		final Form entity = new Form();
		entity.param("client_id", getClientId());
		entity.param("client_secret", getClientSecret());
		entity.param("code", code);
		entity.param("redirect_uri", redirectUri.toString());
		entity.param("grant_type", "authorization_code");
		final AccountToken tokenResponse = client.target(tokenURL()).request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.entity(entity, MediaType.APPLICATION_FORM_URLENCODED_TYPE), AccountToken.class);
		tokenDAO.persist(tokenResponse);
		return tokenResponse;
	}

	public AccountToken refreshToken(final AccountToken accountToken) {
		final JerseyClient client = createClient();
		final Form entity = new Form();
		entity.param("client_id", getClientId());
		entity.param("client_secret", getClientSecret());
		entity.param("refresh_token", accountToken.getRefreshToken());
		entity.param("grant_type", "refresh_token");
		final AccountToken tokenResponse = client.target(tokenURL()).request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.entity(entity, MediaType.APPLICATION_FORM_URLENCODED_TYPE), AccountToken.class);
		accountToken.setAccessToken(tokenResponse.getAccessToken());
		tokenDAO.persist(accountToken);
		return accountToken;
	}

	public List<AccountToken> listTokens() {
		return tokenDAO.listAll();
	}

	private <T> T get(final long tokenId, final String url, final Class<T> responseClass)
			throws GoogleCalendarServiceException {
		final AccountToken accountToken = tokenDAO.get(tokenId);
		HttpGet get = new HttpGet(url);
		get.addHeader("Authorization", "Bearer " + accountToken.getAccessToken());
		try {
			HttpResponse response = googleClient.execute(get);
			if (response.getStatusLine().getStatusCode() == 401) {
				// try refresh the token
				refreshToken(accountToken);
				get = new HttpGet(url);
				get.addHeader("Authorization", "Bearer " + accountToken.getAccessToken());
				response = googleClient.execute(get);
			}
			final HttpEntity entity = response.getEntity();
			final InputStream content = entity.getContent();
			final ByteArrayOutputStream stream = new ByteArrayOutputStream();
			IOUtils.copy(content, stream);
			final String string = stream.toString();
			LOGGER.info("return: " + string);

			final ObjectMapper mapper = new ObjectMapper();
			final T result = mapper.readValue(string, responseClass);
			return result;
		} catch (final IOException e) {
			throw new GoogleCalendarServiceException(e);
		}
	}

	public CalendarList getCalendarList(final long tokenId) throws GoogleCalendarServiceException {
		return get(tokenId, "https://www.googleapis.com/calendar/v3/users/me/calendarList", CalendarList.class);
	}

	public CalendarListEntry getCalendarListEntry(final long tokenId, final String calendarId)
			throws GoogleCalendarServiceException {
		return get(tokenId, "https://www.googleapis.com/calendar/v3/users/me/calendarList/" + calendarId,
				CalendarListEntry.class);
	}

	public Calendar getCalendar(final long tokenId, final String calendarId) throws GoogleCalendarServiceException {
		return get(tokenId, "https://www.googleapis.com/calendar/v3/calendars/" + calendarId, Calendar.class);
	}

	public Events getEvents(final long tokenId, final String calendarId) throws GoogleCalendarServiceException {
		return get(tokenId, "https://www.googleapis.com/calendar/v3/calendars/" + calendarId + "/events", Events.class);
	}
}
