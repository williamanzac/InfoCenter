(function () {
    ko.fullCalendar = {
   	viewModel: function (configuration) {
            this.events = configuration.events;
            this.header = configuration.header;
            this.editable = configuration.editable;
            this.viewDate = configuration.viewDate || ko.observable(new Date());
            this.eventRender = configuration.eventRender;
            this.views = configuration.views;
            this.defaultView = configuration.defaultView;
            this.height = configuration.height;
        }
    };

    // The "fullCalendar" binding
    ko.bindingHandlers.fullCalendar = {
        // This method is called to initialize the node, and will also be called again if you change what the grid is bound to
        update: function (element, viewModelAccessor) {
            var viewModel = viewModelAccessor();
            element.innerHTML = "";

            $(element).fullCalendar({
                events: ko.utils.unwrapObservable(viewModel.events),
                header: viewModel.header,
                editable: viewModel.editable,
                eventRender: viewModel.eventRender,
                views: viewModel.views,
                defaultView: viewModel.defaultView,
                height: viewModel.height
            });
            $(element).fullCalendar('gotoDate', ko.utils.unwrapObservable(viewModel.viewDate));
        }
    };
})();