angular.module("app").service("riesgoService", riesgoService);

riesgoService.$inject = ["$resource"];

function riesgoService($resource) {

		this.riesgos = [];
		
		
		var RiesgoResource = $resource('outdoors/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getRiesgos = function(){
			riesgos = RiesgoResource.query();
			return riesgos;
		}
}