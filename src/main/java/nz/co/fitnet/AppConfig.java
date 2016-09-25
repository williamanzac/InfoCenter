package nz.co.fitnet;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import nz.co.fitnet.core.GoogleConfig;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppConfig extends Configuration {
	@Valid
	@NotNull
	private DataSourceFactory database = new DataSourceFactory();
	@Valid
	@NotNull
	private GoogleConfig google;

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
}
