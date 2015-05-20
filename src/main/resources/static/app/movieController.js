angular.module("app").controller("movieController", movieController);

movieController.$inject = ["movieService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function movieController(movieService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.movies = [];
	
		
	//Controller logic
	
	vm.movies = movieService.getMovies();
	vm.objetivoBusqueda = 'Todos';
	vm.ordenadoPor = 'title';
	vm.categorias = ["DRAMA","COMEDIA","ACCION","TERROR"];
		
	vm.namemovie;
	vm.direct;
	vm.actor;
	vm.product;
	vm.dur;
	vm.description;
	vm.trailer;
	vm.movieimage;
	vm.type_movie;
	//Controller actions
	vm.busqueda = function(categoria){
		vm.objetivoBusqueda = categoria;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor = orden;
	}
	
	
	vm.opendDialog = function(dialogId,movie)
	{
		vm.type_movie = movie.type;
		vm.namemovie = movie.title;
		vm.direct = movie.director;
		vm.actor = movie.leading_actor;
		vm.product = movie.production;
		vm.dur = movie.duration;
		vm.description = movie.description;
		vm.trailer = movie.movie_trailer;
		vm.movieimage = movie.photo;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Cerrada ficha');
	};
	vm.volver= function(){
		$location.path("/");
	}
	
};