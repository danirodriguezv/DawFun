angular.module("app").service("parkService", parkService);

parkService.$inject = [ "$resource","$http","LxNotificationService"];

function parkService($resource,$http,LxNotificationService) {

		this.parks = [];
		
		
		var ParkResource = $resource('parks/:id',{id: '@id'},{update:{method:"PUT"}});
		
	
		this.getParks = function(){
			parks = ParkResource.query();
			return parks;
		}
		
		this.deletePark=function(park) {				
			$http.delete('/parks/'+ park.id).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Borrado Correctamente', 'emoticon', false, 'green');
				}else{
					LxNotificationService.notify('Error al borrar, actualizar pagina', 'emoticon', false, 'red');
				}
				
			});	
				
		}
}