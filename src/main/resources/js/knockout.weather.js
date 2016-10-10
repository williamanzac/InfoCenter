(function() {
	ko.weather = {
		viewModel : function(configuration) {
			var self = this;
			this.current = ko.observable();
			this.dailyForecast = ko.observable();
			this.hourlyForecast = ko.observable();
			this.city = ko.observable(ko.unwrap(configuration.city));
			this.code = ko.observable(ko.unwrap(configuration.code));

			$.ajax("/weather/current?city=" + this.city() + "&code=" + this.code(), {
				type : "get",
				contentType : "application/json",
				success : function(result) {
					var response = result.rawResponse;
					var weather = JSON.parse(response);
					self.current(weather);
				}
			});
			$.ajax("/weather/dailyForecast?city=" + this.city() + "&code=" + this.code(), {
				type : "get",
				contentType : "application/json",
				success : function(result) {
					var response = result.rawResponse;
					var weather = JSON.parse(response);
					self.dailyForecast(weather);
				}
			});
			$.ajax("/weather/hourlyForecast?city=" + this.city() + "&code=" + this.code(), {
				type : "get",
				contentType : "application/json",
				success : function(result) {
					var response = result.rawResponse;
					var weather = JSON.parse(response);
					var list = [];
					var now = moment().unix();
					var plus5 = moment().add(15, "hours").unix();
					weather.list.forEach(function(f) {
						var dt = moment(f.dt * 1000).unix();
						if (dt >= now && dt <= plus5) {
							list.push(f);
						}
					});
					weather.list = list;
					self.hourlyForecast(weather);
				}
			});
		}
	};
})();