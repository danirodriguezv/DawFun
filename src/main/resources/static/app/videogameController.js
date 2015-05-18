angular.module("app").controller("videogameController", videogameController);

videogameController.$inject = ["videogameService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function videogameController(videogameService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.videoclub = [];
	
		
	//Controller logic
	
	vm.videoclub = videogameService.getVideogames();
	vm.namegame;
	vm.develop;
	vm.plat;
	vm.publish;
	vm.pegi;
	vm.categ;
	vm.desc;
	vm.gameimage;
	//Controller actions
	
	vm.opendDialog = function(dialogId,game)
	{
		vm.namegame = game.name;
		vm.develop = game.development;
		vm.plat = game.platform;
		vm.publish = game.publisher;
		vm.pegi = game.pegi_age;
		vm.categ = game.category;
		vm.desc = game.description;
		vm.gameimage = game.image;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Cerrado PopUp');
	};
	
	
};
