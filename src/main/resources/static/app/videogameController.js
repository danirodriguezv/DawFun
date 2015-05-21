angular.module("app").controller("videogameController", videogameController);

videogameController.$inject = ["videogameService", "$routeParams", "$location", "LxNotificationService","LxDialogService","$route"];

function videogameController(videogameService, $routeParams, $location, LxNotificationService,LxDialogService,$route) {

	var vm = this;
	
	//View model properties
	vm.videoclub = [];
	
		
	//Controller logic
	vm.objetivoBusqueda = 'Todos';
	
	vm.ordenadoPor = "name";
	vm.pegi = [3,7,12,16,18];
	vm.categorias = ["ROL","PRIMERA PERSONA","TERCERA PERSONA","SHOOTER"];
	
	
	vm.videoclub = videogameService.getVideogames();
	vm.namegame;
	vm.develop;
	vm.plat;
	vm.publish;
	vm.pegi;
	vm.categ;
	vm.desc;
	vm.gameimage;
	//Controller actions
	vm.busquedaCat = function(categoria){
		vm.objetivoBusqueda = categoria;
	}
	
	vm.busqueda = function(pegi){
		vm.objetivoBusqueda = pegi;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor = orden;
	}
	
	
	vm.opendDialog = function(dialogId,game)
	{
		
		
		vm.namegame = game.name;
		vm.develop = game.development;
		vm.plat = game.platform;
		vm.publish = game.publisher;
		vm.pegi = game.pegi_age;
		vm.categ = game.category;
		vm.desc = game.description;
		vm.gameimage = game.image;
		
		vm.recomendado= game.recomendado;
		vm.juegoAvotar=game;
		
		
		
	    LxDialogService.open(dialogId);
	};

	vm.votarPositivo=function(){
		
		
		//vm.videoclub[vm.indice].recomendado=vm.videoclub[vm.indice].recomendado+1;
		
		
		
		vm.juegoAvotar.recomendado=vm.juegoAvotar.recomendado+1;
		videogameService.valorarVideogame(vm.juegoAvotar);
		
		//LxDialogService.close("test");
		 //$route.reload();
	}
	
	vm.votarNegativo=function(){	
		
		vm.juegoAvotar.recomendado=vm.juegoAvotar.recomendado-1;
		videogameService.valorarVideogame(vm.juegoAvotar);
		
		//LxDialogService.close("test");
		// $route.reload();
		
	}
	
	vm.closingDialog = function()
	{
	    LxNotificationService.info('Visto');
	};
	vm.volver= function(){
		$location.path("/");
	}
	
};
