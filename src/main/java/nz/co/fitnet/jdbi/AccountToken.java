package nz.co.fitnet.jdbi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "token")
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountToken {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String accessToken;
	@Column
	private String scpoe;
	@Column
	private String tokenType;
	@Column
	private String refreshToken;
	@Column
	private String instanceUrl;

	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(final String accessToken) {
		this.accessToken = accessToken;
	}

	@JsonProperty
	public String getScpoe() {
		return scpoe;
	}

	public void setScpoe(final String scpoe) {
		this.scpoe = scpoe;
	}

	@JsonProperty("token_type")
	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(final String tokenType) {
		this.tokenType = tokenType;
	}

	@JsonProperty("refresh_token")
	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(final String refreshToken) {
		this.refreshToken = refreshToken;
	}

	@JsonProperty("instance_url")
	public String getInstanceUrl() {
		return instanceUrl;
	}

	public void setInstanceUrl(final String instanceUrl) {
		this.instanceUrl = instanceUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accessToken == null ? 0 : accessToken.hashCode());
		result = prime * result + (int) (id ^ id >>> 32);
		result = prime * result + (instanceUrl == null ? 0 : instanceUrl.hashCode());
		result = prime * result + (refreshToken == null ? 0 : refreshToken.hashCode());
		result = prime * result + (scpoe == null ? 0 : scpoe.hashCode());
		result = prime * result + (tokenType == null ? 0 : tokenType.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final AccountToken other = (AccountToken) obj;
		if (accessToken == null) {
			if (other.accessToken != null) {
				return false;
			}
		} else if (!accessToken.equals(other.accessToken)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (instanceUrl == null) {
			if (other.instanceUrl != null) {
				return false;
			}
		} else if (!instanceUrl.equals(other.instanceUrl)) {
			return false;
		}
		if (refreshToken == null) {
			if (other.refreshToken != null) {
				return false;
			}
		} else if (!refreshToken.equals(other.refreshToken)) {
			return false;
		}
		if (scpoe == null) {
			if (other.scpoe != null) {
				return false;
			}
		} else if (!scpoe.equals(other.scpoe)) {
			return false;
		}
		if (tokenType == null) {
			if (other.tokenType != null) {
				return false;
			}
		} else if (!tokenType.equals(other.tokenType)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonProperty
	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}
}
