angular.module("app").controller("movieController", movieController);

angular.module("app").config(function($sceDelegateProvider) {
	  $sceDelegateProvider.resourceUrlWhitelist([
	    // Allow same origin resource loads.
	    'self',
	    // Allow loading from our assets domain.  Notice the difference between * and **.
	    "https://www.youtube.com/embed/**"
	  ]);

	  // The blacklist overrides the whitelist so the open redirect here is blocked.
	  $sceDelegateProvider.resourceUrlBlacklist([
	    'http://myapp.example.com/clickThru**'
	  ]);
	});



movieController.$inject = ["movieService", "$routeParams", "$location", "LxNotificationService","LxDialogService","$sce","$sceDelegate"];

function movieController(movieService, $routeParams, $location, LxNotificationService,LxDialogService,$sce, $sceDelegate) {

	var vm = this;
	
	//View model properties
	vm.movies = [];
	
		
	//Controller logic
	
	
	vm.objetivoBusqueda = 'Todos';
	vm.ordenadoPor = 'title';
	vm.categorias = ["DRAMA","COMEDIA","ACCION","TERROR"];
		
	vm.movies = movieService.getMovies();
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
		
		
		vm.trailer= "https://www.youtube.com/embed/"+movie.movie_trailer;
		vm.movieimage = movie.photo;
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