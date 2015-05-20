angular.module("app").controller("riesgoController", riesgoController);

riesgoController.$inject = ["riesgoService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function riesgoController(riesgoService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.riesgos = [];
	
		
	//Controller logic
	vm.riesgos = riesgoService.getActividades();
	vm.objetivoBusqueda = 'Todos';
	vm.ordenadoPor = 'name';
	vm.categorias = ["ALTO","MEDIO","BAJO"];
	
	vm.name_activity;
	vm.descrip_activity;
	vm.price_activity;
	vm.age_activity;
	vm.direc_activity;
	vm.show_activity;
	vm.image_activity;
	vm.dur_activity;
	vm.privince_activity;
	
	//Controller actions
	vm.busqueda = function(cat){
		vm.objetivoBusqueda = cat;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor = orden;
	}
	
	
	vm.opendDialog = function(dialogId,riesgo)
	{
		vm.name_activity = riesgo.name;
		vm.descrip_activity= riesgo.description;
		vm.price_activity = riesgo.price;
		vm.age_activity = riesgo.age_recomended;
		vm.direc_activity = riesgo.address;
		vm.show_activity = riesgo.risk;
		vm.image_activity = riesgo.image;
		vm.dur_activity = riesgo.duration;
		vm.province_activity = riesgo.province;
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