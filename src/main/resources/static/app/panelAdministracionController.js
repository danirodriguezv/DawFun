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
	vm.categorias=["Terror","Fantastico","Ciencia Ficcion","Juvenil","Humanistico","Romantica","Poesia","Novela Negra","Otros"];
	vm.generogame = ["ROL","PRIMERA PERSONA","TERCERA PERSONA","SHOOTER"];
	vm.pegi = [3,7,12,16,18];
	
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
		var posicion = vm.videogames.indexOf(game);		
		videogameService.deleteVideogame(game);	
		vm.videogames.splice(posicion, 1);
		};
		
		//
	vm.borrarLibro = function(libro){		
		var posicion = vm.books.indexOf(libro);		
		bookService.deleteBook(libro);	
		vm.books.splice(posicion, 1);
	};
	
	vm.borrarPelicula = function(peli){		
		var posicion = vm.movies.indexOf(peli);		
		movieService.deleteMovie(peli);	
		vm.movies.splice(posicion, 1);
	};
	
	
	vm.borrarParque = function(park){		
		var posicion = vm.parks.indexOf(park);		
		parkService.deletePark(park);	
		vm.parks.splice(posicion, 1);
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
	};
	
};
