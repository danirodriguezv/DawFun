angular.module("app").controller("movieController", movieController);

movieController.$inject = ["movieService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function movieController(movieService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.movies = [];
	
		
	//Controller logic
	
	vm.movies = movieService.getMovies();
	vm.namemovie;
	vm.direct;
	vm.actor;
	vm.product;
	vm.dur;
	vm.description;
	vm.trailer;
	vm.movieimage;
	//Controller actions
	
	vm.opendDialog = function(dialogId,movie)
	{
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
	    LxNotificationService.info('Cerrado PopUp');
	};
	vm.volver= function(){
		$location.path("/");
	}
	
};