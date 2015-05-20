angular.module("app").service("localService", localService);

localService.$inject = ["$resource","$http","LxNotificationService"];

function localService($resource,$http,LxNotificationService) {

		this.locals = [];
		
		
		var localResource = $resource('locals/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getLocals = function(){
			locals = localResource.query();
			return locals;
		}
		
		this.deleteLocal=function(local) {				
			$http.delete('/locals/'+ local.id).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Borrado Correctamente', 'emoticon', false, 'green');
				}else{
					LxNotificationService.notify('Error al borrar, actualizar pagina', 'emoticon', false, 'red');
				}
				
			});	
				
		}
}