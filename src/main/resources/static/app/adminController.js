angular.module("app").controller("adminController", adminController);

adminController.$inject = ["cinemaService","LxNotificationService"];

// libreria->  LxNotificationService


function adminController(cinemaService,LxNotificationService) {

	var vm = this;
	vm.tupla={};
	vm.nombreUsuario="";
	vm.contrasena="";
	
	vm.loguear = function(){		
		location.href="/access?nom="+vm.tupla.nombreUsuario+"&pass="+vm.tupla.contrasena;
	};
	
	
	
	
};
