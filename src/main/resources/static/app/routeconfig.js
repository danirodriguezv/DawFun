angular.module("app").config(RouteConfig);

RouteConfig.$inject = ['$routeProvider'];

function RouteConfig($routeProvider){
	$routeProvider.when('/',{ templateUrl : "templates/welcome.html"});
	$routeProvider.when('/acceso',{ templateUrl : "templates/adminAccess.html"});
	$routeProvider.when('/cinemas/:id',{ templateUrl : "templates/cinema.html"});
}