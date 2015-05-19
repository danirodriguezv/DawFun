angular.module("app").controller("adminController", adminController);

adminController.$inject = ["bookService","LxNotificationService"];

// libreria->  LxNotificationService


function adminController(bookService,LxNotificationService) {

	var vm = this;
	vm.tupla={};
	vm.nombreUsuario="";
	vm.contrasena="";
	
	vm.loguear = function(){		
		location.href="/access?nom="+vm.tupla.nombreUsuario+"&pass="+vm.tupla.contrasena;
	};
	
	
	
	
};
