package nz.co.fitnet.core.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.util.DateTime;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {

	@JsonProperty
	private String accessRole;

	@JsonProperty
	private List<EventReminder> defaultReminders;

	@JsonProperty
	private String description;

	@JsonProperty
	private String etag;

	@JsonProperty
	private List<Event> items;

	@JsonProperty
	private String kind;

	@JsonProperty
	private String nextPageToken;

	@JsonProperty
	private String nextSyncToken;

	@JsonProperty
	private String summary;

	@JsonProperty
	private String timeZone;

	@JsonProperty
	private DateTime updated;

	public String getAccessRole() {
		return accessRole;
	}

	public Events setAccessRole(String accessRole) {
		this.accessRole = accessRole;
		return this;
	}

	public List<EventReminder> getDefaultReminders() {
		return defaultReminders;
	}

	public Events setDefaultReminders(List<EventReminder> defaultReminders) {
		this.defaultReminders = defaultReminders;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Events setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getEtag() {
		return etag;
	}

	public Events setEtag(String etag) {
		this.etag = etag;
		return this;
	}

	public List<Event> getItems() {
		return items;
	}

	public Events setItems(List<Event> items) {
		this.items = items;
		return this;
	}

	public String getKind() {
		return kind;
	}

	public Events setKind(String kind) {
		this.kind = kind;
		return this;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public Events setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		return this;
	}

	public String getNextSyncToken() {
		return nextSyncToken;
	}

	public Events setNextSyncToken(String nextSyncToken) {
		this.nextSyncToken = nextSyncToken;
		return this;
	}

	public String getSummary() {
		return summary;
	}

	public Events setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public Events setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public DateTime getUpdated() {
		return updated;
	}

	public Events setUpdated(DateTime updated) {
		this.updated = updated;
		return this;
	}
}
