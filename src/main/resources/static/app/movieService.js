angular.module("app").service("movieService", movieService);

movieService.$inject = ["$resource","$http","LxNotificationService"];

function movieService($resource,$http,LxNotificationService) {

		this.movies = [];
		
		
		var moviesResource = $resource('movies/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getMovies = function(){
			movies = moviesResource.query();
			return movies;
		}
		
		this.deleteMovie=function(movie) {				
			
			
			$http.delete('/movies/'+ movie.id).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Borrado Correctamente', 'emoticon', false, 'green');
				}else{
					LxNotificationService.notify('Error al borrar, actualizar pagina', 'emoticon', false, 'red');
				}
				
			});	
				
		}
		
		this.addPelicula=function(peli) {			
			new moviesResource(peli).$save(function(post) {
				this.movies.push(post);
				LxNotificationService.notify('Añadido Correctamente', 'emoticon', false, 'green');
			});
			
		};
}