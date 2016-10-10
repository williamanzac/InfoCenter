package nz.co.fitnet.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Calendar {

	@JsonProperty
	private String description;

	@JsonProperty
	private String etag;

	@JsonProperty
	private String id;

	@JsonProperty
	private String kind;

	@JsonProperty
	private String location;

	@JsonProperty
	private String summary;

	@JsonProperty
	private String timeZone;

	public String getDescription() {
		return description;
	}

	public Calendar setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getEtag() {
		return etag;
	}

	public Calendar setEtag(String etag) {
		this.etag = etag;
		return this;
	}

	public String getId() {
		return id;
	}

	public Calendar setId(String id) {
		this.id = id;
		return this;
	}

	public String getKind() {
		return kind;
	}

	public Calendar setKind(String kind) {
		this.kind = kind;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public Calendar setLocation(String location) {
		this.location = location;
		return this;
	}

	public String getSummary() {
		return summary;
	}

	public Calendar setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public Calendar setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
	}
}
