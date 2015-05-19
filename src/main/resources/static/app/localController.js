angular.module("app").controller("movieController", movieController);

movieController.$inject = ["movieService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function movieController(movieService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.locals = [];
	
		
	//Controller logic
	
	vm.locals = localService.getLocals();
	vm.namelocal;
	vm.star;
	vm.price;
	vm.direc;
	vm.food;
	vm.prov;
	vm.image;
	vm.open;
	vm.close;
	vm.capac;
	vm.type;
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,local)
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