angular.module("app").service("adminService", adminService);

adminService.$inject = [ "$resource"];

function adminService($resource) {

		this.log ;
		
		
		var AdminResource = $resource('access/:use:pass',{use: '@userd',pass: '@pass'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.isAdmin = function(use,pass){
			log = AdminResource.query(use,pass);
			return log;
		}
		/*
		this.getBooks = function(id){
			book = BookResource.query(id);
			return book;
		}
		*/	

		
		
		
}