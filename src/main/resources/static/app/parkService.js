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
		
		this.addPark=function(p) {			
			new ParkResource(p).$save(function(post) {
				this.parks.push(post);
				LxNotificationService.notify('Añadido Correctamente', 'emoticon', false, 'green');
			});
			
		};
		
		this.updateParque=function(park){			
			$http.put('/parks/', park);
			LxNotificationService.notify('Actualizado Correctamente', 'emoticon', false, 'green');			
			
		};
}