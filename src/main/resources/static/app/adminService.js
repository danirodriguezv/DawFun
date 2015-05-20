angular.module("app").service("adminService", adminService);

adminService.$inject = [ "$resource","$http","$location","LxNotificationService"];

function adminService($resource,$http,$location,LxNotificationService) {

		this.log ;
		
		

	
		//var AdminResource = $resource('access/:use:pass',{use: '@userd',pass: '@pass'},{update:{method:"PUT"}});
		//var AdminResource = $resource('access/:user:pass',{user: '@user',pass: '@pass'},{update:{method:"PUT"}});
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BookResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});
		//var AdminResource = $resource('/access/admin/1234');
		
	
		
		var AdminResource = $resource('/access/:usuario/:pass',{usuario:'admin',pass:'1234'});
		
		this.logAdmin = function(usuario,pass){	
			
			var cadena="nom="+usuario+"&pass="+pass;
			$http.post('/access/', cadena).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Logueado Correctamente', 'emoticon', false, 'green');
					$location.path("/panelAdmin"); //si el login es correcto
				}else{
					LxNotificationService.notify('Error acceso', 'emoticon', false, 'red');
					$location.path("/"); //si el login falla
				}});			
			/*$http({
			    method: 'POST',
			    url: '/access/',
			    data: cuerpo,
			    headers: {'Content-Type': 'application/x-www-form-urlencoded'}
			})*/						
		}
		

		
		
		
}