package nz.co.fitnet.core.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.util.DateTime;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	@JsonProperty
	private Boolean anyoneCanAddSelf;

	@JsonProperty
	private List<EventAttachment> attachments;

	@JsonProperty
	private List<EventAttendee> attendees;

	@JsonProperty
	private Boolean attendeesOmitted;

	@JsonProperty
	private String colorId;

	@JsonProperty
	private DateTime created;

	@JsonProperty
	private Creator creator;

	@JsonProperty
	private String description;

	@JsonProperty
	private EventDateTime end;

	@JsonProperty
	private Boolean endTimeUnspecified;

	@JsonProperty
	private String etag;

	@JsonProperty
	private ExtendedProperties extendedProperties;

	@JsonProperty
	private Gadget gadget;

	@JsonProperty
	private Boolean guestsCanInviteOthers;

	@JsonProperty
	private Boolean guestsCanModify;

	@JsonProperty
	private Boolean guestsCanSeeOtherGuests;

	@JsonProperty
	private String hangoutLink;

	@JsonProperty
	private String htmlLink;

	@JsonProperty
	private String iCalUID;

	@JsonProperty
	private String id;

	@JsonProperty
	private String kind;

	@JsonProperty
	private String location;

	@JsonProperty
	private Boolean locked;

	@JsonProperty
	private Organizer organizer;

	@JsonProperty
	private EventDateTime originalStartTime;

	@JsonProperty
	private Boolean privateCopy;

	@JsonProperty
	private List<String> recurrence;

	@JsonProperty
	private String recurringEventId;

	@JsonProperty
	private Reminders reminders;

	@JsonProperty
	private Integer sequence;

	@JsonProperty
	private Source source;

	@JsonProperty
	private EventDateTime start;

	@JsonProperty
	private String status;

	@JsonProperty
	private String summary;

	@JsonProperty
	private String transparency;

	@JsonProperty
	private DateTime updated;

	@JsonProperty
	private String visibility;

	public Boolean getAnyoneCanAddSelf() {
		return anyoneCanAddSelf;
	}

	public Event setAnyoneCanAddSelf(Boolean anyoneCanAddSelf) {
		this.anyoneCanAddSelf = anyoneCanAddSelf;
		return this;
	}

	public boolean isAnyoneCanAddSelf() {
		if (anyoneCanAddSelf == null || anyoneCanAddSelf == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return anyoneCanAddSelf;
	}

	public List<EventAttachment> getAttachments() {
		return attachments;
	}

	public Event setAttachments(List<EventAttachment> attachments) {
		this.attachments = attachments;
		return this;
	}

	public List<EventAttendee> getAttendees() {
		return attendees;
	}

	public Event setAttendees(List<EventAttendee> attendees) {
		this.attendees = attendees;
		return this;
	}

	public Boolean getAttendeesOmitted() {
		return attendeesOmitted;
	}

	public Event setAttendeesOmitted(Boolean attendeesOmitted) {
		this.attendeesOmitted = attendeesOmitted;
		return this;
	}

	public boolean isAttendeesOmitted() {
		if (attendeesOmitted == null || attendeesOmitted == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return attendeesOmitted;
	}

	public String getColorId() {
		return colorId;
	}

	public Event setColorId(String colorId) {
		this.colorId = colorId;
		return this;
	}

	public DateTime getCreated() {
		return created;
	}

	public Event setCreated(DateTime created) {
		this.created = created;
		return this;
	}

	public Creator getCreator() {
		return creator;
	}

	public Event setCreator(Creator creator) {
		this.creator = creator;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Event setDescription(String description) {
		this.description = description;
		return this;
	}

	public EventDateTime getEnd() {
		return end;
	}

	public Event setEnd(EventDateTime end) {
		this.end = end;
		return this;
	}

	public Boolean getEndTimeUnspecified() {
		return endTimeUnspecified;
	}

	public Event setEndTimeUnspecified(Boolean endTimeUnspecified) {
		this.endTimeUnspecified = endTimeUnspecified;
		return this;
	}

	public boolean isEndTimeUnspecified() {
		if (endTimeUnspecified == null || endTimeUnspecified == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return endTimeUnspecified;
	}

	public String getEtag() {
		return etag;
	}

	public Event setEtag(String etag) {
		this.etag = etag;
		return this;
	}

	public ExtendedProperties getExtendedProperties() {
		return extendedProperties;
	}

	public Event setExtendedProperties(ExtendedProperties extendedProperties) {
		this.extendedProperties = extendedProperties;
		return this;
	}

	public Gadget getGadget() {
		return gadget;
	}

	public Event setGadget(Gadget gadget) {
		this.gadget = gadget;
		return this;
	}

	public Boolean getGuestsCanInviteOthers() {
		return guestsCanInviteOthers;
	}

	public Event setGuestsCanInviteOthers(Boolean guestsCanInviteOthers) {
		this.guestsCanInviteOthers = guestsCanInviteOthers;
		return this;
	}

	public boolean isGuestsCanInviteOthers() {
		if (guestsCanInviteOthers == null || guestsCanInviteOthers == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return true;
		}
		return guestsCanInviteOthers;
	}

	public Boolean getGuestsCanModify() {
		return guestsCanModify;
	}

	public Event setGuestsCanModify(Boolean guestsCanModify) {
		this.guestsCanModify = guestsCanModify;
		return this;
	}

	public boolean isGuestsCanModify() {
		if (guestsCanModify == null || guestsCanModify == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return guestsCanModify;
	}

	public Boolean getGuestsCanSeeOtherGuests() {
		return guestsCanSeeOtherGuests;
	}

	public Event setGuestsCanSeeOtherGuests(Boolean guestsCanSeeOtherGuests) {
		this.guestsCanSeeOtherGuests = guestsCanSeeOtherGuests;
		return this;
	}

	public boolean isGuestsCanSeeOtherGuests() {
		if (guestsCanSeeOtherGuests == null || guestsCanSeeOtherGuests == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return true;
		}
		return guestsCanSeeOtherGuests;
	}

	public String getHangoutLink() {
		return hangoutLink;
	}

	public Event setHangoutLink(String hangoutLink) {
		this.hangoutLink = hangoutLink;
		return this;
	}

	public String getHtmlLink() {
		return htmlLink;
	}

	public Event setHtmlLink(String htmlLink) {
		this.htmlLink = htmlLink;
		return this;
	}

	public String getICalUID() {
		return iCalUID;
	}

	public Event setICalUID(String iCalUID) {
		this.iCalUID = iCalUID;
		return this;
	}

	public String getId() {
		return id;
	}

	public Event setId(String id) {
		this.id = id;
		return this;
	}

	public String getKind() {
		return kind;
	}

	public Event setKind(String kind) {
		this.kind = kind;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public Event setLocation(String location) {
		this.location = location;
		return this;
	}

	public Boolean getLocked() {
		return locked;
	}

	public Event setLocked(Boolean locked) {
		this.locked = locked;
		return this;
	}

	public boolean isLocked() {
		if (locked == null || locked == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return locked;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public Event setOrganizer(Organizer organizer) {
		this.organizer = organizer;
		return this;
	}

	public EventDateTime getOriginalStartTime() {
		return originalStartTime;
	}

	public Event setOriginalStartTime(EventDateTime originalStartTime) {
		this.originalStartTime = originalStartTime;
		return this;
	}

	public Boolean getPrivateCopy() {
		return privateCopy;
	}

	public Event setPrivateCopy(Boolean privateCopy) {
		this.privateCopy = privateCopy;
		return this;
	}

	public boolean isPrivateCopy() {
		if (privateCopy == null || privateCopy == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return privateCopy;
	}

	public List<String> getRecurrence() {
		return recurrence;
	}

	public Event setRecurrence(List<String> recurrence) {
		this.recurrence = recurrence;
		return this;
	}

	public String getRecurringEventId() {
		return recurringEventId;
	}

	public Event setRecurringEventId(String recurringEventId) {
		this.recurringEventId = recurringEventId;
		return this;
	}

	public Reminders getReminders() {
		return reminders;
	}

	public Event setReminders(Reminders reminders) {
		this.reminders = reminders;
		return this;
	}

	public Integer getSequence() {
		return sequence;
	}

	public Event setSequence(Integer sequence) {
		this.sequence = sequence;
		return this;
	}

	public Source getSource() {
		return source;
	}

	public Event setSource(Source source) {
		this.source = source;
		return this;
	}

	public EventDateTime getStart() {
		return start;
	}

	public Event setStart(EventDateTime start) {
		this.start = start;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Event setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getSummary() {
		return summary;
	}

	public Event setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public String getTransparency() {
		return transparency;
	}

	public Event setTransparency(String transparency) {
		this.transparency = transparency;
		return this;
	}

	public DateTime getUpdated() {
		return updated;
	}

	public Event setUpdated(DateTime updated) {
		this.updated = updated;
		return this;
	}

	public String getVisibility() {
		return visibility;
	}

	public Event setVisibility(String visibility) {
		this.visibility = visibility;
		return this;
	}

	public static final class Creator {

		@JsonProperty
		private String displayName;

		@JsonProperty
		private String email;

		@JsonProperty
		private String id;

		@JsonProperty
		private Boolean self;

		public String getDisplayName() {
			return displayName;
		}

		public Creator setDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}

		public String getEmail() {
			return email;
		}

		public Creator setEmail(String email) {
			this.email = email;
			return this;
		}

		public String getId() {
			return id;
		}

		public Creator setId(String id) {
			this.id = id;
			return this;
		}

		public Boolean getSelf() {
			return self;
		}

		public Creator setSelf(Boolean self) {
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

	public static final class ExtendedProperties {

		@JsonProperty("private")
		private Map<String, String> private__;

		@JsonProperty
		private Map<String, String> shared;

		public Map<String, String> getPrivate() {
			return private__;
		}

		public ExtendedProperties setPrivate(Map<String, String> private__) {
			this.private__ = private__;
			return this;
		}

		public Map<String, String> getShared() {
			return shared;
		}

		public ExtendedProperties setShared(Map<String, String> shared) {
			this.shared = shared;
			return this;
		}
	}

	public static final class Gadget {

		@JsonProperty
		private String display;

		@JsonProperty
		private Integer height;

		@JsonProperty
		private String iconLink;

		@JsonProperty
		private String link;

		@JsonProperty
		private Map<String, String> preferences;

		@JsonProperty
		private String title;

		@JsonProperty
		private String type;

		@JsonProperty
		private Integer width;

		public String getDisplay() {
			return display;
		}

		public Gadget setDisplay(String display) {
			this.display = display;
			return this;
		}

		public Integer getHeight() {
			return height;
		}

		public Gadget setHeight(Integer height) {
			this.height = height;
			return this;
		}

		public String getIconLink() {
			return iconLink;
		}

		public Gadget setIconLink(String iconLink) {
			this.iconLink = iconLink;
			return this;
		}

		public String getLink() {
			return link;
		}

		public Gadget setLink(String link) {
			this.link = link;
			return this;
		}

		public Map<String, String> getPreferences() {
			return preferences;
		}

		public Gadget setPreferences(Map<String, String> preferences) {
			this.preferences = preferences;
			return this;
		}

		public String getTitle() {
			return title;
		}

		public Gadget setTitle(String title) {
			this.title = title;
			return this;
		}

		public String getType() {
			return type;
		}

		public Gadget setType(String type) {
			this.type = type;
			return this;
		}

		public Integer getWidth() {
			return width;
		}

		public Gadget setWidth(Integer width) {
			this.width = width;
			return this;
		}
	}

	public static final class Organizer {

		@JsonProperty
		private String displayName;

		@JsonProperty
		private String email;

		@JsonProperty
		private String id;

		@JsonProperty
		private Boolean self;

		public String getDisplayName() {
			return displayName;
		}

		public Organizer setDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}

		public String getEmail() {
			return email;
		}

		public Organizer setEmail(String email) {
			this.email = email;
			return this;
		}

		public String getId() {
			return id;
		}

		public Organizer setId(String id) {
			this.id = id;
			return this;
		}

		public Boolean getSelf() {
			return self;
		}

		public Organizer setSelf(Boolean self) {
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

	public static final class Reminders {

		@JsonProperty
		private List<EventReminder> overrides;

		@JsonProperty
		private Boolean useDefault;

		public List<EventReminder> getOverrides() {
			return overrides;
		}

		public Reminders setOverrides(List<EventReminder> overrides) {
			this.overrides = overrides;
			return this;
		}

		public Boolean getUseDefault() {
			return useDefault;
		}

		public Reminders setUseDefault(Boolean useDefault) {
			this.useDefault = useDefault;
			return this;
		}
	}

	public static final class Source {

		@JsonProperty
		private String title;

		@JsonProperty
		private String url;

		public String getTitle() {
			return title;
		}

		public Source setTitle(String title) {
			this.title = title;
			return this;
		}

		public String getUrl() {
			return url;
		}

		public Source setUrl(String url) {
			this.url = url;
			return this;
		}
	}
}
