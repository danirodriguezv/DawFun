angular.module("app").controller("parkController", parkController);

parkController.$inject = ["parkService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function parkController(parkService, $routeParams, $location, LxNotificationService,LxDialogService) {
	
	var vm = this;
	
	//View model properties
	vm.parks=[];
	
		
	//Controller logic
	
	vm.parks = parkService.getParks();
	
	vm.objetivoBusqueda='Todos';
	vm.categorias=["Acuatico","Tematico","Atracciones","Safari","Zoologico"];
	vm.ordenadoPor="price";
	
	
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,park)
	{
		
		vm.nombreSelec = park.name_park;
		vm.descripcionSelec = park.description_park;		
		vm.direccionSelec =park.address_park;
		vm.provinciaSelec = park.province_park;		
		vm.horaAperturaSelec = park.open_park;
		vm.horaCierreSelec = park.close_park;		
		vm.priceSelec = park.price_park;
		vm.checkSelec = park.check_park;		
		vm.imagenSelec = park.image_park;
		vm.kindSelec = park.kind_park;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{		
	    LxNotificationService.notify('Visto!', 'emoticon', false, 'yellow');
	};
	
	vm.volver= function(){
		$location.path("/");
	}
	
	//Aquí podríamos hacer una especie de filtro de parques temáticos acuáticos o no, en plan aquopolis, parque de atracciones, Warner...
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
