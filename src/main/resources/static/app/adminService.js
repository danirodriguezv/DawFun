angular.module("app").service("adminService", adminService);

adminService.$inject = [ "$resource"];

function adminService($resource) {

		this.log ;
		
		
		//var AdminResource = $resource('access/:use:pass',{use: '@userd',pass: '@pass'},{update:{method:"PUT"}});
		//var AdminResource = $resource('access/:user:pass',{user: '@user',pass: '@pass'},{update:{method:"PUT"}});
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BookResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});
		//var AdminResource = $resource('/access/admin/1234');
		
	
		
		var AdminResource = $resource('/access/:usuario/:pass',{usuario:'admin',pass:'1234'});
		
		this.isAdmin = function(use,pass){	
			/*this.user=use;
			this.pass=pass;
			var log = AdminResource.get();	
			alert(log);
			return log;*/
			
			//comprobacion en el lado cliente, no hay narices de recoger el boleano que devuelve
			
			return (use==="admin"&&pass==="1234");			
		}
		/*
		this.getBooks = function(id){
			book = BookResource.query(id);
			return book;
		}
		*/	

		
		
		
}