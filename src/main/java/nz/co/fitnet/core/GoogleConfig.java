package nz.co.fitnet.core;

import io.dropwizard.client.HttpClientConfiguration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoogleConfig {
	@JsonProperty
	private String clientId;
	@JsonProperty
	private String clientSecret;
	@JsonProperty
	private final HttpClientConfiguration httpClient = new HttpClientConfiguration();

	public String getClientId() {
		return clientId;
	}

	public void setClientId(final String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(final String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public HttpClientConfiguration getHttpClient() {
		return httpClient;
	}
}
