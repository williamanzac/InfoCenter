package nz.co.fitnet;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.client.HttpClientBuilder;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import nz.co.fitnet.api.AccountToken;
import nz.co.fitnet.core.GoogleCalendarService;
import nz.co.fitnet.core.GoogleConfig;
import nz.co.fitnet.jdbi.AccountTokenDAO;
import nz.co.fitnet.resources.GoogleCalendarResource;

import org.apache.http.client.HttpClient;
import org.hibernate.SessionFactory;

public class App extends Application<AppConfig> {

	private final HibernateBundle<AppConfig> hibernate = new HibernateBundle<AppConfig>(AccountToken.class) {
		@Override
		public DataSourceFactory getDataSourceFactory(final AppConfig configuration) {
			return configuration.getDataSourceFactory();
		}
	};

	public static void main(final String[] args) throws Exception {
		new App().run(args);
	}

	@Override
	public void initialize(final Bootstrap<AppConfig> bootstrap) {
		super.initialize(bootstrap);
		bootstrap.addBundle(hibernate);
		bootstrap.addBundle(new AssetsBundle("/js", "/js", null, "js"));
		bootstrap.addBundle(new AssetsBundle("/css", "/css", null, "css"));
		bootstrap.addBundle(new AssetsBundle("/html", "/ui", "ui.html"));
	}

	@Override
	public void run(final AppConfig configuration, final Environment environment) throws Exception {
		final SessionFactory sessionFactory = hibernate.getSessionFactory();

		final GoogleConfig googleConfig = configuration.getGoogle();

		final HttpClient googleClient = new HttpClientBuilder(environment).using(googleConfig.getHttpClient()).build(
				"Google");

		final AccountTokenDAO tokenDAO = new AccountTokenDAO(sessionFactory);

		final GoogleCalendarService calendarService = new GoogleCalendarService(googleConfig, tokenDAO, googleClient);

		final GoogleCalendarResource calendarResource = new GoogleCalendarResource(calendarService);

		environment.jersey().register(calendarResource);
	}
}
