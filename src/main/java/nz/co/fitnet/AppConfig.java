package nz.co.fitnet;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import nz.co.fitnet.core.GoogleConfig;
import nz.co.fitnet.core.WeatherConfig;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppConfig extends Configuration {
	@Valid
	@NotNull
	private DataSourceFactory database = new DataSourceFactory();
	@Valid
	@NotNull
	private GoogleConfig google;
	@Valid
	@NotNull
	private WeatherConfig weather;

	@JsonProperty("database")
	public DataSourceFactory getDataSourceFactory() {
		return database;
	}

	public void setDataSourceFactory(final DataSourceFactory factory) {
		database = factory;
	}

	@JsonProperty
	public GoogleConfig getGoogle() {
		return google;
	}

	public void setGoogle(final GoogleConfig google) {
		this.google = google;
	}

	@JsonProperty
	public WeatherConfig getWeather() {
		return weather;
	}

	public void setWeather(WeatherConfig weather) {
		this.weather = weather;
	}
}
