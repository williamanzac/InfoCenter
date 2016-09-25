package nz.co.fitnet.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarNotification {

	@JsonProperty
	private String method;

	@JsonProperty
	private String type;

	public String getMethod() {
		return method;
	}

	public CalendarNotification setMethod(String method) {
		this.method = method;
		return this;
	}

	public String getType() {
		return type;
	}

	public CalendarNotification setType(String type) {
		this.type = type;
		return this;
	}
}
