function InfoCenterViewModel() {
	var self = this;

	this.calendarMonthView = new ko.fullCalendar.viewModel({
	    events: {
	        url: '/calendar/33/william.anzac@gmail.com/events'
	    },
	    header: {
	        left: '',
	        center: 'title',
	        right: ''
	    },
	    editable: false,
	});
	this.calendarDayView = new ko.fullCalendar.viewModel({
	    events: {
	        url: '/calendar/33/william.anzac@gmail.com/events'
	    },
	    header: {
	        left: '',
	        center: '',
	        right: ''
	    },
	    defaultView: "agendaDay",
	    height: "parent",
	    editable: false,
	});
	this.amberleyWeather = new ko.weather.viewModel({
		"city": "Amberley",
		"code": "NZ"
	});
	this.chchWeather = new ko.weather.viewModel({
		"city": "Christchurch",
		"code": "NZ"
	});
}

var model = new InfoCenterViewModel();
ko.applyBindings(model);