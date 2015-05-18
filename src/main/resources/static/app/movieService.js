angular.module("app").service("movieService", movieService);

movieService.$inject = ["$resource"];

function movieService($resource) {

		this.movies = [];
		
		
		var moviesResource = $resource('movies/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getMovies = function(){
			movies = moviesResource.query();
			return movies;
		}
}