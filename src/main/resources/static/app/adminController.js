angular.module("app").controller("adminController", adminController);

adminController.$inject = ["bookService","LxNotificationService","$location"];

// libreria->  LxNotificationService


function adminController(bookService,LxNotificationService,$location) {

	var vm = this;
	vm.tupla={};
	vm.nombreUsuario="";
	vm.contrasena="";
	
	vm.loguear = function(){		
		location.href="/access?nom="+vm.tupla.nombreUsuario+"&pass="+vm.tupla.contrasena;
	};
	
	vm.ir= function(sitio){
				
		$location.path("/"+sitio);
	}
	
	
	
};
