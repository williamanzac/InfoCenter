function InfoCenterViewModel() {
	var self = this;
	this.calendar = new ko.calendar.viewModel();
	this.test = "test";
}

ko.applyBindings(new InfoCenterViewModel());