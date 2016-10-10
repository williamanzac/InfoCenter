package nz.co.fitnet.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.HourlyForecast;
import nz.co.fitnet.core.OWMWeatherService;
import nz.co.fitnet.core.ServiceException;

@Path("/weather")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WeatherResource {

	private OWMWeatherService weatherService;

	public WeatherResource(OWMWeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}

	@GET
	@Path("/current")
	public Response getCurrent(final @QueryParam("city") String city, final @QueryParam("code") String code)
			throws ServiceException {
		final CurrentWeather weather = weatherService.getCurrentWeather(city, code);
		return Response.ok(weather).build();
	}

	@GET
	@Path("/dailyForecast")
	public Response getDailyForcast(final @QueryParam("city") String city, final @QueryParam("code") String code)
			throws ServiceException {
		final DailyForecast dailyForecast = weatherService.getDailyForecast(city, code);
		return Response.ok(dailyForecast).build();
	}

	@GET
	@Path("/hourlyForecast")
	public Response getHourlyForecast(final @QueryParam("city") String city, final @QueryParam("code") String code)
			throws ServiceException {
		final HourlyForecast hourlyForecast = weatherService.getHourlyForecast(city, code);
		return Response.ok(hourlyForecast).build();
	}
}
