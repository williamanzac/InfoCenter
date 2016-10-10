package nz.co.fitnet.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventReminder {

	@JsonProperty
	private String method;

	@JsonProperty
	private Integer minutes;

	public String getMethod() {
		return method;
	}

	public EventReminder setMethod(String method) {
		this.method = method;
		return this;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public EventReminder setMinutes(Integer minutes) {
		this.minutes = minutes;
		return this;
	}
}
