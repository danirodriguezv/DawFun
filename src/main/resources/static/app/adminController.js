angular.module("app").controller("adminController", adminController);

adminController.$inject = ["adminService","LxNotificationService","$location"];

// libreria->  LxNotificationService


function adminController(adminService,LxNotificationService,$location) {

	var vm = this;
	
	vm.nombreUsuario;
	vm.contrasena;
	
	
	vm.loguear = function(){		
		//location.href="/access?nom="+vm.tupla.nombreUsuario+"&pass="+vm.tupla.contrasena;
		vm.esAdmin=adminService.isAdmin(vm.nombreUsuario,vm.contrasena);
		if (vm.esAdmin){
			$location.path("/"+sitio);
		}
		
	};
	
	vm.ir= function(sitio){
				
		$location.path("/"+sitio);
	}
	
	
	
};
