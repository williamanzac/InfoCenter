package nz.co.fitnet.resources;

import static javax.ws.rs.core.UriBuilder.fromResource;
import io.dropwizard.hibernate.UnitOfWork;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import nz.co.fitnet.api.AccountToken;
import nz.co.fitnet.api.Calendar;
import nz.co.fitnet.api.CalendarList;
import nz.co.fitnet.api.CalendarListEntry;
import nz.co.fitnet.api.Events;
import nz.co.fitnet.core.GoogleCalendarService;
import nz.co.fitnet.core.GoogleCalendarServiceException;

import com.codahale.metrics.annotation.Timed;

@Path("/calendar")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GoogleCalendarResource {
	@Context
	UriInfo uriInfo;

	private final GoogleCalendarService service;

	public GoogleCalendarResource(final GoogleCalendarService service) {
		super();
		this.service = service;
	}

	@GET
	@Timed
	@UnitOfWork
	@Path("/tokens")
	public Response listTokens() {
		final List<AccountToken> tokens = service.listTokens();
		return Response.ok(tokens).build();
	}

	@GET
	@UnitOfWork
	@Path("/oauth")
	@Produces(MediaType.TEXT_HTML)
	public Response startConnect() {
		final URI uri = getRedirectUri();
		final URI url = service.getAuthorizeURIForService(uri);
		// log.info(url);
		return Response.temporaryRedirect(url).build();
	}

	private URI getRedirectUri() {
		return uriInfo.resolve(fromResource(getClass()).path(getClass(), "finishConnect").build());
	}

	@POST
	@UnitOfWork
	@Path("/oauth/callback")
	@Produces(MediaType.TEXT_HTML)
	public Response finishConnect(final @QueryParam("code") String code, final @QueryParam("state") String state)
			throws IOException {
		// log.info("processing post");
		final URI uri = getRedirectUri();

		service.getAccessToken(code, state, uri);
		return Response.ok().build();
	}

	@GET
	@UnitOfWork
	@Path("/oauth/callback")
	@Produces(MediaType.TEXT_HTML)
	public Response finishConnectGet(final @QueryParam("code") String code, final @QueryParam("state") String state)
			throws IOException {
		return finishConnect(code, state);
	}

	@GET
	@UnitOfWork
	@Path("/list/{tokenId}")
	public Response getCalendarList(final @PathParam("tokenId") long tokenId) throws GoogleCalendarServiceException {
		final CalendarList calendarList = service.getCalendarList(tokenId);
		return Response.ok(calendarList).build();
	}

	@GET
	@UnitOfWork
	@Path("/list/{tokenId}/{calendarId}")
	public Response getCalendarListEntry(final @PathParam("tokenId") long tokenId,
			final @PathParam("calendarId") String calendarId) throws GoogleCalendarServiceException {
		final CalendarListEntry calendarList = service.getCalendarListEntry(tokenId, calendarId);
		return Response.ok(calendarList).build();
	}

	@GET
	@UnitOfWork
	@Path("/{tokenId}/{calendarId}")
	public Response getCalendar(final @PathParam("tokenId") long tokenId,
			final @PathParam("calendarId") String calendarId) throws GoogleCalendarServiceException {
		final Calendar calendarList = service.getCalendar(tokenId, calendarId);
		return Response.ok(calendarList).build();
	}

	@GET
	@UnitOfWork
	@Path("/{tokenId}/{calendarId}/events")
	public Response getEvents(final @PathParam("tokenId") long tokenId, final @PathParam("calendarId") String calendarId)
			throws GoogleCalendarServiceException {
		final Events events = service.getEvents(tokenId, calendarId);
		return Response.ok(events).build();
	}
}
