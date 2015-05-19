angular.module("app").service("riesgoService", riesgoService);

riesgoService.$inject = ["$resource"];

function riesgoService($resource) {

		this.riesgos = [];
		
		
		var riesgoResource = $resource('outdoors/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getRiesgos = function(){
			riesgos = riesgoResource.query();
			return riesgos;
		}
}