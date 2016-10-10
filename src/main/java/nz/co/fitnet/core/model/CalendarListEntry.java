package nz.co.fitnet.core.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarListEntry {

	@JsonProperty
	private String accessRole;

	@JsonProperty
	private String backgroundColor;

	@JsonProperty
	private String colorId;

	@JsonProperty
	private List<EventReminder> defaultReminders;

	@JsonProperty
	private Boolean deleted;

	@JsonProperty
	private String description;

	@JsonProperty
	private String etag;

	@JsonProperty
	private String foregroundColor;

	@JsonProperty
	private Boolean hidden;

	@JsonProperty
	private String id;

	@JsonProperty
	private String kind;

	@JsonProperty
	private String location;

	@JsonProperty
	private NotificationSettings notificationSettings;

	@JsonProperty
	private Boolean primary;

	@JsonProperty
	private Boolean selected;

	@JsonProperty
	private String summary;

	@JsonProperty
	private String summaryOverride;

	@JsonProperty
	private String timeZone;

	public String getAccessRole() {
		return accessRole;
	}

	public CalendarListEntry setAccessRole(String accessRole) {
		this.accessRole = accessRole;
		return this;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public CalendarListEntry setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getColorId() {
		return colorId;
	}

	public CalendarListEntry setColorId(String colorId) {
		this.colorId = colorId;
		return this;
	}

	public List<EventReminder> getDefaultReminders() {
		return defaultReminders;
	}

	public CalendarListEntry setDefaultReminders(List<EventReminder> defaultReminders) {
		this.defaultReminders = defaultReminders;
		return this;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public CalendarListEntry setDeleted(Boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	public boolean isDeleted() {
		if (deleted == null || deleted == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return deleted;
	}

	public String getDescription() {
		return description;
	}

	public CalendarListEntry setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getEtag() {
		return etag;
	}

	public CalendarListEntry setEtag(String etag) {
		this.etag = etag;
		return this;
	}

	public String getForegroundColor() {
		return foregroundColor;
	}

	public CalendarListEntry setForegroundColor(String foregroundColor) {
		this.foregroundColor = foregroundColor;
		return this;
	}

	public Boolean getHidden() {
		return hidden;
	}

	public CalendarListEntry setHidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	public boolean isHidden() {
		if (hidden == null || hidden == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return hidden;
	}

	public String getId() {
		return id;
	}

	public CalendarListEntry setId(String id) {
		this.id = id;
		return this;
	}

	public String getKind() {
		return kind;
	}

	public CalendarListEntry setKind(String kind) {
		this.kind = kind;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public CalendarListEntry setLocation(String location) {
		this.location = location;
		return this;
	}

	public NotificationSettings getNotificationSettings() {
		return notificationSettings;
	}

	public CalendarListEntry setNotificationSettings(NotificationSettings notificationSettings) {
		this.notificationSettings = notificationSettings;
		return this;
	}

	public Boolean getPrimary() {
		return primary;
	}

	public CalendarListEntry setPrimary(Boolean primary) {
		this.primary = primary;
		return this;
	}

	public boolean isPrimary() {
		if (primary == null || primary == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return primary;
	}

	public Boolean getSelected() {
		return selected;
	}

	public CalendarListEntry setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	public boolean isSelected() {
		if (selected == null || selected == com.google.api.client.util.Data.NULL_BOOLEAN) {
			return false;
		}
		return selected;
	}

	public String getSummary() {
		return summary;
	}

	public CalendarListEntry setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public String getSummaryOverride() {
		return summaryOverride;
	}

	public CalendarListEntry setSummaryOverride(String summaryOverride) {
		this.summaryOverride = summaryOverride;
		return this;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public CalendarListEntry setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	@JsonInclude(Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class NotificationSettings {
		@JsonProperty
		private List<CalendarNotification> notifications;

		public List<CalendarNotification> getNotifications() {
			return notifications;
		}

		public NotificationSettings setNotifications(List<CalendarNotification> notifications) {
			this.notifications = notifications;
			return this;
		}
	}
}
