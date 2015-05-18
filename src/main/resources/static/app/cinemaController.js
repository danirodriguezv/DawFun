angular.module("app").controller("cinemaController", cinemaController);

cinemaController.$inject = ["cinemaService","LxNotificationService", "$location"];

// libreria->  LxNotificationService


function cinemaController(cinemaService,LxNotificationService, $location) {

	var vm = this;

	vm.cinemas = [];
	vm.cinema_selected; //cine seleccionado en el welcome, vm.cinema_selected.id muestra el id

	vm.cinemas = cinemaService.getCinemas();
	
	vm.borrar = function(post){		
		cinemaService.deleteCinema(cinema);		
	};
	
	vm.notify = function(type)
	{
		
	    if (type === 'simple')
	    {
	        LxNotificationService.notify('Lorem Ipsum');
	    }
	    else if (type === 'sticky')
	    {
	        LxNotificationService.notify('Lorem Ipsum', undefined, true);
	    }	   
	};
	
	vm.prueba = function(id){
		vm.cinema_selected=id;
	};
	
	vm.acceder = function(id){
		
		$location.path("/cinemas/"+id);
	};
	
};
