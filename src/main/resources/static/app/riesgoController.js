angular.module("app").controller("riesgoController", riesgoController);

riesgoController.$inject = ["riesgoService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function riesgoController(riesgoService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.riesgos = [];
	
		
	//Controller logic
	vm.objetivoBusqueda = 'Todos';
	vm.ordenadoPor = 'name';
	vm.categorias = ["ALTO","MEDIO","BAJO"];
	
	vm.riesgos = riesgoService.getRiesgos();
	vm.name;
	vm.descrip;
	vm.price;
	vm.age;
	vm.direc;
	vm.risk;
	vm.image;
	vm.dur;
	
	//Controller actions
	vm.busqueda = function(categoria){
		vm.objetivoBusqueda = categoria;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor = orden;
	}
	
	
	vm.opendDialog = function(dialogId,riesgo)
	{
		vm.name = riesgo.name;
		vm.descrip = riesgo.description;
		vm.price = riesgo.price;
		vm.age = riesgo.age_recomended;
		vm.direc = riesgo.address;
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