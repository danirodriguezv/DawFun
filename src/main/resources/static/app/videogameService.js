angular.module("app").service("videogameService", videogameService);

videogameService.$inject = ["$resource","$http"];

function videogameService($resource,$http) {

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
			
		this.deleteVideogame=function(video) {				
			//$http.delete('/videogames/'+ video.id);
			
			$http.delete('/videogames/'+ video.id).success(function (d) { 					
				if(d===true){
					alert("borrado correctamente");
					return d;
				}else{
					alert("no lo ha borrado");
					return d;
				}
				
			});	
				
		}
		
		
		
		
		
}