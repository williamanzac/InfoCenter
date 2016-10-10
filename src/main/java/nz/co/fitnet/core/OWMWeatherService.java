package nz.co.fitnet.core;

import java.io.IOException;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.HourlyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import net.aksingh.owmjapis.OpenWeatherMap.Units;

import org.json.JSONException;

public class OWMWeatherService {

	// public static void main(String[] args) throws ServiceException {
	// new OWMWeatherService().getCurrentWeather();
	// }

	private final WeatherConfig config;

	public OWMWeatherService(WeatherConfig config) {
		super();
		this.config = config;
	}

	public CurrentWeather getCurrentWeather(final String city, final String code) throws ServiceException {
		OpenWeatherMap map = new OpenWeatherMap(Units.METRIC, config.getApiKey());
		try {
			final CurrentWeather weather = map.currentWeatherByCityName(city, code);
			return weather;
		} catch (JSONException | IOException e) {
			throw new ServiceException(e);
		}
	}

	public DailyForecast getDailyForecast(final String city, final String code) throws ServiceException {
		OpenWeatherMap map = new OpenWeatherMap(Units.METRIC, config.getApiKey());
		try {
			final DailyForecast dailyForecast = map.dailyForecastByCityName(city, code, (byte) 5);
			System.out.println(dailyForecast.getForecastCount());
			System.out.println(dailyForecast.getForecastInstance(0).getHumidity());
			System.out.println(dailyForecast.getForecastInstance(0).getPercentageOfClouds());
			System.out.println(dailyForecast.getForecastInstance(0).getPressure());
			System.out.println(dailyForecast.getForecastInstance(0).getRain());
			System.out.println(dailyForecast.getForecastInstance(0).getSnow());
			System.out.println(dailyForecast.getForecastInstance(0).getWindDegree());
			System.out.println(dailyForecast.getForecastInstance(0).getWindSpeed());
			System.out.println(dailyForecast.getForecastInstance(0).getDateTime());
			System.out.println(dailyForecast.getForecastInstance(0).getTemperatureInstance().getDayTemperature());
			System.out.println(dailyForecast.getForecastInstance(0).getTemperatureInstance().getEveningTemperature());
			System.out.println(dailyForecast.getForecastInstance(0).getTemperatureInstance().getMaximumTemperature());
			System.out.println(dailyForecast.getForecastInstance(0).getTemperatureInstance().getMinimumTemperature());
			System.out.println(dailyForecast.getForecastInstance(0).getTemperatureInstance().getMorningTemperature());
			System.out.println(dailyForecast.getForecastInstance(0).getTemperatureInstance().getNightTemperature());
			System.out.println(dailyForecast.getForecastInstance(0).getWeatherCount());
			System.out.println(dailyForecast.getForecastInstance(0).getWeatherInstance(0).getWeatherCode());
			System.out.println(dailyForecast.getForecastInstance(0).getWeatherInstance(0).getWeatherDescription());
			System.out.println(dailyForecast.getForecastInstance(0).getWeatherInstance(0).getWeatherIconName());
			System.out.println(dailyForecast.getForecastInstance(0).getWeatherInstance(0).getWeatherName());
			return dailyForecast;
		} catch (JSONException | IOException e) {
			throw new ServiceException(e);
		}
	}

	public HourlyForecast getHourlyForecast(final String city, final String code) throws ServiceException {
		OpenWeatherMap map = new OpenWeatherMap(Units.METRIC, config.getApiKey());
		try {
			final HourlyForecast hourlyForecast = map.hourlyForecastByCityName(city, code);
			System.out.println(hourlyForecast.getForecastCount());
			System.out.println(hourlyForecast.getForecastInstance(0).getWeatherInstance(0).getWeatherCode());
			System.out.println(hourlyForecast.getForecastInstance(0).getMainInstance().getTemperature());
			return hourlyForecast;
		} catch (JSONException | IOException e) {
			throw new ServiceException(e);
		}
	}
}
