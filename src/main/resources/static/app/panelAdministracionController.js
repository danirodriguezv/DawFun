angular.module("app").controller("panelAdministracionController", panelAdministracionController);

panelAdministracionController.$inject = ["adminService","bookService","movieService","localService","parkService","riesgoService","videogameService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];






function panelAdministracionController(adminService,bookService,movieService,localService,parkService,riesgoService,videogameService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	
	vm.desconectar = function(){
		adminService.desconect();
	}
	
	vm.nuevaActividad={};
	vm.nuevoVideojuego={};
	vm.nuevoLibro = {};
	vm.nuevaPeli = {};
	vm.nuevoParque = {};
	vm.nuevoLocal = {};
	vm.objetivoBusqueda = 'Todos';
	
	vm.tipos = ["VIDEOGAME","LIBRO","PELICULA","PARQUE TEMATICO","LOCAL","ACTIVIDAD"];
	vm.categorias=["Terror","Fantastico","Ciencia Ficcion","Juvenil","Humanistico","Romantica","Poesia","Novela Negra","Otros"];
	vm.generogame = ["ROL","PRIMERA PERSONA","TERCERA PERSONA","SHOOTER"];
	vm.pegi = [3,7,12,16,18];
	vm.tipo_pelis = ["DRAMA","COMEDIA","ACCION","TERROR"];
	vm.permite = [true,false];
	vm.tipo_parque=["Acuatico","Tematico","Atracciones","Safari","Zoologico"];
	vm.tipo_local = ["PUB","RESTAURANTE"];
	vm.tipo_riesgo = ["ALTO","MEDIO","BAJO"];
	
	vm.books = bookService.getBooks();
	vm.movies = movieService.getMovies();
	vm.locals = localService.getLocals();
	vm.parks = parkService.getParks();
	vm.actividades = riesgoService.getActividades();
	vm.videogames = videogameService.getVideogames();
	
	
		
	//Controller logic
	vm.aniadirLocal = function(){
		vm.nuevoLocal.class_type = "LOCAL";
		vm.nuevoLocal.photo = "localDefault.jpg";
		localService.addLocal(vm.nuevoLocal);
	}
	
	
	vm.aniadirParque = function(){
		vm.nuevoParque.class_type="PARQUE TEMATICO";
		vm.nuevoParque.image_park="parqueDefault.jpg";
		parkService.addPark(vm.nuevoParque);
	}
	
	vm.aniadirPelicula = function(){
		vm.nuevaPeli.class_type="PELICULA";
		vm.nuevaPeli.photo ="peliculaDefault.jpg";
		movieService.addPelicula(vm.nuevaPeli);
	};
	
	vm.aniadirLibro = function(){		
		vm.nuevoLibro.class_type="LIBRO";
		vm.nuevoLibro.image="libroDefault.jpg";		
		bookService.addLibro(vm.nuevoLibro);
	};
	
	vm.aniadirVideojuego = function(){		
		vm.nuevoVideojuego.class_type="VIDEOGAME";
		vm.nuevoVideojuego.image="videojuegoDefault.jpg";		
		videogameService.addVideogame(vm.nuevoVideojuego);
	};
	
	vm.aniadirActividad = function(){
		vm.nuevaActividad.class_type="ACTIVIDAD";
		vm.nuevaActividad.image_activity="actividadDefault.jpg";
		riesgoService.addActividad(vm.nuevaActividad);
	}
	
	
	
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
	
	vm.borrarLocal = function(local){		
		var posicion = vm.locals.indexOf(local);		
		localService.deleteLocal(local);	
		vm.locals.splice(posicion, 1);
	};
	
	
	vm.borrarActividad = function(actividad){		
		var posicion = vm.actividades.indexOf(actividad);		
		riesgoService.deleteActividad(actividad);	
		vm.actividades.splice(posicion, 1);
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
	
	
	
	/****** EDITAR *****/
	
	vm.editar = function(cosa){		
		vm.juegoEditado=cosa;
		LxDialogService.open("editarJuego");
	}
	
	vm.aniadirVideojuegoEditado=function(){			
		videogameService.updateVideogame(vm.juegoEditado);		
	}
	
/****** EDITAR LIBRO*****/
	
	vm.editarLibro = function(cosa){		
		vm.libroEditado=cosa;
		LxDialogService.open("editarLibro");
	}
	
	vm.aniadirLibroEditado=function(){			
		bookService.updateLibro(vm.libroEditado);		
	}
	
	
/****** EDITAR PELICULA*****/
	
	vm.editarPelicula = function(cosa){		
		vm.peliculaEditada=cosa;
		LxDialogService.open("editarPelicula");
	}
	
	vm.aniadirPeliculaEditada=function(){			
		movieService.updatePelicula(vm.peliculaEditada);		
	}
	
	
};
