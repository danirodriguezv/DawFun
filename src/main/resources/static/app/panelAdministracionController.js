angular.module("app").controller("panelAdministracionController", panelAdministracionController);

panelAdministracionController.$inject = ["adminService","bookService","movieService","localService","parkService","riesgoService","videogameService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];






function panelAdministracionController(adminService,bookService,movieService,localService,parkService,riesgoService,videogameService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	
	vm.desconectar = function(){
		adminService.desconect();
	}
	
	vm.objetivoBusqueda = 'Todos';
	
	vm.books = bookService.getBooks();
	vm.movies = movieService.getMovies();
	vm.locals = localService.getLocals();
	vm.parks = parkService.getParks();
	vm.actividades = riesgoService.getActividades();
	vm.videogames = videogameService.getVideogames();
		
	//Controller logic
	
	vm.busqueda = function(tipo){
		vm.objetivoBusqueda = tipo;
	}

	vm.borrarVideojuego = function(game){
		
		var posicion = vm.videogames.indexOf(game);
		
		videogameService.deleteVideogame(game);
		
		vm.videogames.splice(posicion, 1); 		
		
	}
	
	
};
