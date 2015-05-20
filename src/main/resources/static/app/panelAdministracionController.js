angular.module("app").controller("panelAdministracionController", panelAdministracionController);

panelAdministracionController.$inject = ["adminService","bookService","movieService","localService","parkService","riesgoService","videogameService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];






function panelAdministracionController(adminService,bookService,movieService,localService,parkService,riesgoService,videogameService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	
	vm.desconectar = function(){
		adminService.desconect();
	}
	
	vm.objetivoBusqueda = 'Todos';
	
	vm.tipos = ["VIDEOGAME","LIBRO","PELICULA","PARQUE TEMATICO","LOCAL","ACTIVIDAD"];
	
	vm.books = bookService.getBooks();
	vm.movies = movieService.getMovies();
	vm.locals = localService.getLocals();
	vm.parks = parkService.getParks();
	vm.actividades = riesgoService.getActividades();
	vm.videogames = videogameService.getVideogames();
		
	//Controller logic
	
	vm.busqueda = function(tipo){
		vm.objetivoBusqueda = tipo;
	};

	vm.borrarVideojuego = function(game){
		alert("alemnos");
		videogameService.deleteVideogame(game);
	};
	
	vm.opendDialog = function(dialogId)
	{
		vm.game = vm.tipos[0];
		vm.libro = vm.tipos[1];
		vm.pelicula = vm.tipos[2];
		vm.parque = vm.tipos[3];
		vm.local = vm.tipos[4];
		vm.actividad = vm.tipos[5];
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
