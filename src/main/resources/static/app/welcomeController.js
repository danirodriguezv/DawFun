angular.module("app").controller("welcomeController", welcomeController);

welcomeController.$inject = ["$routeParams", "$location", "LxNotificationService","LxDialogService"];

function welcomeController($routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	
	
		
	//Controller logic
	
	
	
	
	
	
	
	//Controller actions
	
	
	
	vm.ir= function(sitio){
		$location.path("/"+sitio);
	}
	
	
};
