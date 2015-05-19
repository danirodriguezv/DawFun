angular.module("app").factory("promocionateService", promocionateServiec);

promocionateService.$inject = [ "$resource", "$timeout" ];

function promocionateService($resource, $timeout) {

	var RequestResource = $resource('/request/:id', {
		id : '@id'
	}, {
		update : {
			method : "PUT"
		}
	});	

	var requests = [];
	
function newRequest(newRequest) {
		new RequestResource(newRequest).$save(function(request) {
			requests.push(request);
		});
	}