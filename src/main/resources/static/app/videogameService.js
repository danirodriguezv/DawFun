angular.module("app").service("videogameService", videogameService);

videogameService.$inject = ["$resource"];

function videogameService($resource) {

		this.videoclub =[];
		
		
		var videogameResource = $resource('videogames/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getVideogames = function(){
			videoclub = videogameResource.query();
			return videoclub;
		}
		
		/*this.getBooks = function(id){
			book = BookResource.query(id);
			return book;
		}*/
			

		
		
		
}