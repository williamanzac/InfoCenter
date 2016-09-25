package nz.co.fitnet.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventAttachment {

	@JsonProperty
	private String fileId;

	@JsonProperty
	private String fileUrl;

	@JsonProperty
	private String iconLink;

	@JsonProperty
	private String mimeType;

	@JsonProperty
	private String title;

	public String getFileId() {
		return fileId;
	}

	public EventAttachment setFileId(String fileId) {
		this.fileId = fileId;
		return this;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public EventAttachment setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		return this;
	}

	public String getIconLink() {
		return iconLink;
	}

	public EventAttachment setIconLink(String iconLink) {
		this.iconLink = iconLink;
		return this;
	}

	public String getMimeType() {
		return mimeType;
	}

	public EventAttachment setMimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public EventAttachment setTitle(String title) {
		this.title = title;
		return this;
	}
}
