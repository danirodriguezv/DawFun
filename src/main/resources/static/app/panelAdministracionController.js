angular.module("app").controller("panelAdministracionController", panelAdministracionController);

panelAdministracionController.$inject = ["adminService","bookService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];






function panelAdministracionController(adminService,bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	
	vm.desconectar = function(){
		adminService.desconect();
	}
	
	vm.books = bookService.getBooks();
	vm.movies = movieService.getMovies();
		
	//Controller logic
	


	
	
};
