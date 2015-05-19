angular.module("app").controller("riesgoController", riesgoController);

riesgoController.$inject = ["riesgoService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function riesgoController(riesgoService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.riesgos = [];
	
		
	//Controller logic
	
	vm.riesgos = riesgoService.getRiesgos();
	vm.name;
	vm.descrip;
	vm.price;
	vm.age;
	vm.site;
	vm.risk;
	vm.image;
	vm.dur;
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,riesgo)
	{
		vm.name = riesgo.name;
		vm.descrip = riesgo.description;
		vm.price = riesgo.price;
		vm.age = riesgo.age_recomended;
		vm.site = riesgo.site;
		vm.risk = riesgo.risk;
		vm.image = riesgo.image;
		vm.dur = riesgo.duration;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Ficha cerrada');
	};
	vm.volver= function(){
		$location.path("/");
	}
	
};