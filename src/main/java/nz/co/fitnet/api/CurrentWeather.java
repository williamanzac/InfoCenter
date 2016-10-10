package nz.co.fitnet.api;

import java.util.Date;
import java.util.List;

import net.aksingh.owmjapis.AbstractWeather.Weather;
import net.aksingh.owmjapis.CurrentWeather.Clouds;
import net.aksingh.owmjapis.CurrentWeather.Coord;
import net.aksingh.owmjapis.CurrentWeather.Main;
import net.aksingh.owmjapis.CurrentWeather.Rain;
import net.aksingh.owmjapis.CurrentWeather.Sys;
import net.aksingh.owmjapis.CurrentWeather.Wind;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {
	@JsonProperty
	private Date dateTime;

	@JsonProperty
	private int weatherCount;
	@JsonProperty
	private List<Weather> weatherList;

	@JsonProperty
	private String base;
	@JsonProperty
	private long cityId;
	@JsonProperty
	private String cityName;

	@JsonProperty
	private Clouds clouds;
	@JsonProperty
	private Coord coord;
	@JsonProperty
	private Main main;
	@JsonProperty
	private Rain rain;
	@JsonProperty
	private Sys sys;
	@JsonProperty
	private Wind wind;

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public int getWeatherCount() {
		return weatherCount;
	}

	public void setWeatherCount(int weatherCount) {
		this.weatherCount = weatherCount;
	}

	public List<Weather> getWeatherList() {
		return weatherList;
	}

	public void setWeatherList(List<Weather> weatherList) {
		this.weatherList = weatherList;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

}
