angular.module("app").controller("localController", localController);

localController.$inject = ["localService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function movieController(movieService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.locals = [];
	
		
	//Controller logic
	
	vm.locals = localService.getLocals();
	vm.namelocal;
	vm.star;
	vm.price;
	vm.direc;
	vm.food;
	vm.prov;
	vm.image;
	vm.open;
	vm.close;
	vm.capac;
	vm.type;
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,local)
	{
		vm.namelocal = local.name;
		vm.star = local.star;
		vm.price = local.price_medium;
		vm.direc = local.address;
		vm.food = local.food_type;
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
	
};