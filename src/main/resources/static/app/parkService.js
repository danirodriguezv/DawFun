angular.module("app").service("parkService", parkService);

parkService.$inject = [ "$resource"];

function parkService($resource) {

		this.parks = [];
		
		
		var ParkResource = $resource('parks/:id',{id: '@id'},{update:{method:"PUT"}});
		
	
		this.getParks = function(){
			parks = ParkResource.query();
			return parks;
		}
}