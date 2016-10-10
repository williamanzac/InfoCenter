package nz.co.fitnet.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventAttendee {

	@JsonProperty
	private Integer additionalGuests;

	@JsonProperty
	private String comment;

	@JsonProperty
	private String displayName;

	@JsonProperty
	private String email;

	@JsonProperty
	private String id;

	@JsonProperty
	private Boolean optional;

	@JsonProperty
	private Boolean organizer;

	@JsonProperty
	private Boolean resource;

	@JsonProperty
	private String responseStatus;

	@JsonProperty
	private Boolean self;

	public Integer getAdditionalGuests() {
		return additionalGuests;
	}

	public EventAttendee setAdditionalGuests(Integer additionalGuests) {
		this.additionalGuests = additionalGuests;
		return this;
	}

	public String getComment() {
		return comment;
	}

	public EventAttendee setComment(String comment) {
		this.comment = comment;
		return this;
	}

	public String getDisplayName() {
		return displayName;
	}

	public EventAttendee setDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public EventAttendee setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getId() {
		return id;
	}

	public EventAttendee setId(String id) {
		this.id = id;
		return this;
	}

	public Boolean getOptional() {
		return optional;
	}

	public EventAttendee setOptional(Boolean optional) {
		this.optional = optional;
		return this;
	}

	public boolean isOptional() {
		if (optional == null || optional == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return optional;
	}

	public Boolean getOrganizer() {
		return organizer;
	}

	public EventAttendee setOrganizer(Boolean organizer) {
		this.organizer = organizer;
		return this;
	}

	public Boolean getResource() {
		return resource;
	}

	public EventAttendee setResource(Boolean resource) {
		this.resource = resource;
		return this;
	}

	public boolean isResource() {
		if (resource == null || resource == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return resource;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public EventAttendee setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
		return this;
	}

	public Boolean getSelf() {
		return self;
	}

	public EventAttendee setSelf(Boolean self) {
		this.self = self;
		return this;
	}

	public boolean isSelf() {
		if (self == null || self == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return self;
	}
}
