angular.module("app").controller("kineController", kineController);

CinemaController.$inject = ["cinemaService", "$routeParams", "$location", "LxNotificationService"];

function kineController(cinemaService, $routeParams, $location, LxNotificationService) {

	var vm = this;
	
	//View model properties
	
	vm.cinema = {};
		
	//Controller logic
	
	vm.cinema = cinemaService.getCinema($routeParams.id);
	//Controller actions
	
};

