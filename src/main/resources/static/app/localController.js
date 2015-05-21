angular.module("app").controller("localController", localController);

localController.$inject = ["localService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function localController(localService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.locals = [];
	
	vm.objetivoBusqueda = 'Todos';
	
	vm.ordenadoPor = "name";
	vm.categorias = ["PUB","RESTAURANTE"];
		
	//Controller logic
	
	vm.locals = localService.getLocals();
	vm.namelocal;
	vm.star;
	vm.price;
	vm.direc;
	vm.prov;
	vm.image;
	vm.open;
	vm.close;
	vm.capac;
	vm.type;
	vm.descrip;
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,local)
	{
		vm.namelocal = local.name;
		vm.star = local.star;
		vm.price = local.price_medium;
		vm.direc = local.address_local;
		vm.descrip = local.descripcion;
		vm.prov = local.province;
		vm.image = local.photo;
		vm.open = local.open_time;
		vm.close = local.close_time;
		vm.capac = local.capacity;
		vm.type = local.local_type;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Ficha cerrada');
	};
	
	vm.volver= function(){
		$location.path("/");
	}
	
	vm.busqueda = function(categoria){
		
		vm.objetivoBusqueda=categoria;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor=orden;
	}
	
	vm.abrirDialogSugerencia = function(dialogId){
		LxDialogService.open(dialogId);
	}
	
};