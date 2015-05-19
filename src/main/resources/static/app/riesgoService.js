angular.module("app").service("localService", localService);

localService.$inject = ["$resource"];

function localService($resource) {

		this.locals = [];
		
		
		var localResource = $resource('locals/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getLocals = function(){
			locals = localResource.query();
			return locals;
		}
}