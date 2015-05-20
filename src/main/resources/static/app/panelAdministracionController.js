angular.module("app").controller("panelAdministracionController", panelAdministracionController);

panelAdministracionController.$inject = ["adminService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];






function panelAdministracionController(adminService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	
	vm.desconectar = function(){
		adminService.desconect();
	}
		
	//Controller logic
	
	

	
	
};
