package nz.co.fitnet.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherConfig {
	@JsonProperty
	private String apiKey;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
}
