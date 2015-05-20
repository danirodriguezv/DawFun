angular.module("app").service("videogameService", videogameService);

videogameService.$inject = ["$resource","$http","LxNotificationService"];

function videogameService($resource,$http,LxNotificationService) {

		this.videoclub =[];
		
		
		var videogameResource = $resource('videogames/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getVideogames = function(){
			videoclub = videogameResource.query();
			return videoclub;
		}
		
		
		this.deleteVideogame=function(video) {				
			//$http.delete('/videogames/'+ video.id);
			
			$http.delete('/videogames/'+ video.id).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Borrado Correctamente', 'emoticon', false, 'green');
				}else{
					LxNotificationService.notify('Error al borrar, actualizar pagina', 'emoticon', false, 'red');
				}
				
			});	
				
		}
		
		
		
		
		
}