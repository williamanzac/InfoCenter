(function {
	ko.calendar = {
		viewModel: function (configuration) {
			var self = this;
			this.events = ko.observableArray([]);
			this.startDate = ko.observable(moment(ko.unwrap(this.today)).startOf("month").startOf("week"));
			this.endDate = ko.observable(moment(ko.unwrap(this.today)).endOf("month").endOf("week"));
			this.mode = ko.observable();
			this.today = ko.observable(moment());
			
			this.eventsInView = ko.computed(function () {
				var list = ko.unwrap(self.events);
				var ret = [];
				list.forEach(function (event) {
					if (moment(event.start.dateTime.value) >= self.startDate || moment(event.end.dateTime.value) <= self.endDate) {
						ret.push(event);
					}
				});
				return ret;
			}, this);
		}
	}
/*
	var templateEngine = new ko.nativeTemplateEngine();

	templateEngine.addTemplate = function(templateName, templateMarkup) {
		document.write("<script type='text/html' id='" + templateName + "'>" + templateMarkup + "<" + "/script>");
	};

	*/
})();