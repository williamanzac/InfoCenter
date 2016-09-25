package nz.co.fitnet.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.services.calendar.model.CalendarListEntry;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarList {

	@JsonProperty
	private String etag;

	@JsonProperty
	private List<CalendarListEntry> items;

	@JsonProperty
	private String kind;

	@JsonProperty
	private String nextPageToken;

	@JsonProperty
	private String nextSyncToken;

	public String getEtag() {
		return etag;
	}

	public CalendarList setEtag(String etag) {
		this.etag = etag;
		return this;
	}

	public List<CalendarListEntry> getItems() {
		return items;
	}

	public CalendarList setItems(List<CalendarListEntry> items) {
		this.items = items;
		return this;
	}

	public String getKind() {
		return kind;
	}

	public CalendarList setKind(String kind) {
		this.kind = kind;
		return this;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public CalendarList setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		return this;
	}

	public String getNextSyncToken() {
		return nextSyncToken;
	}

	public CalendarList setNextSyncToken(String nextSyncToken) {
		this.nextSyncToken = nextSyncToken;
		return this;
	}
}
