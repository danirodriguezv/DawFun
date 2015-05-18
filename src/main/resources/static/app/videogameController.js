angular.module("app").controller("videogameController", videogameController);

videogameController.$inject = ["videogameService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function videogameController(videogameService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.videoclub = [];
	
		
	//Controller logic
	
	vm.videoclub = videogameService.getVideogames();
	
	
	
	//Controller actions
	
	vm.opendDialog = function(dialogId)
	{
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Dialog cerrado!');
	};
	
};
