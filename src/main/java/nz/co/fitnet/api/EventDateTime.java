package nz.co.fitnet.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.util.DateTime;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDateTime {

	@JsonProperty
	private DateTime date;

	@JsonProperty
	private DateTime dateTime;

	@JsonProperty
	private String timeZone;

	public DateTime getDate() {
		return date;
	}

	public EventDateTime setDate(DateTime date) {
		this.date = date;
		return this;
	}

	public DateTime getDateTime() {
		return dateTime;
	}

	public EventDateTime setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public EventDateTime setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
	}
}
