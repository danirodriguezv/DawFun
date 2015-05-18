angular.module("app").factory("cinemaService", cinemaService);

cinemaService.$inject = [ "$resource", "$timeout" ];

function cinemaService($resource, $timeout) {

	var CinemaResource = $resource('/cinemas/:id', {
		id : '@id'
	}, {
		update : {
			method : "PUT"
		}
	});

	var cinemas = [];

	function autoreload(){
		reload();
		$timeout(autoreload, 5000);
	}
	
	autoreload();
	
	return {
		reload : reload,
		getCinemas : getCinemas,
		getCinema : getCinema,		
		newCinema : newCinema,
		updateCinema : updateCinema,
		deleteCinema : deleteCinema
	}

	function reload(){
		var promise = CinemaResource.query(function(newCinemas){
			cinemas.length = 0;
			cinemas.push.apply(cinemas, newCinemas);
		}).$promise;
		return promise;
	}
	
	function getCinemas() {
		return cinemas;
	}

	function getCinema(id) {
		for (var i = 0; i < cinemas.length; i++) {
			if (cinemas[i].id.toString() === id) {
				return cinemas[i];
			}
		}
	}

	function newCinema(newCinema) {
		new CinemaResource(newCinema).$save(function(cinema) {
			cinemas.push(cinema);
		});
	}

	function updateCinema(updatedCinema) {
		updatedCinema.$update();
	}

	function deleteCinema(cinema) {
		cinema.$remove(function() {
			cinemas.splice(cinemas.indexOf(cinema), 1);
		});
	}	
}