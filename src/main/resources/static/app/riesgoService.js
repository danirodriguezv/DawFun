angular.module("app").service("riesgoService", riesgoService);

riesgoService.$inject = ["$resource","$http","LxNotificationService"];

function riesgoService($resource,$http,LxNotificationService) {

		this.riesgos = [];
		
		
		var RiesgoResource = $resource('outdoors/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getActividades = function(){
			riesgos = RiesgoResource.query();
			return riesgos;
		}
		
		this.deleteActividad=function(actividad) {				
			$http.delete('/outdoors/'+ actividad.id).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Borrado Correctamente', 'emoticon', false, 'green');
				}else{
					LxNotificationService.notify('Error al borrar, actualizar pagina', 'emoticon', false, 'red');
				}
				
			});	
				
		}
		this.addActividad=function(actividad) {			
			new RiesgoResource(actividad).$save(function(post) {
				this.riesgos.push(post);
				LxNotificationService.notify('Añadido Correctamente', 'emoticon', false, 'green');
			});
			
		}
		
		this.updateActividad=function(activ){			
			$http.put('/outdoors/', activ);
			LxNotificationService.notify('Actualizado Correctamente', 'emoticon', false, 'green');			
			
		};
}