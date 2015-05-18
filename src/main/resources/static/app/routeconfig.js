angular.module("app").config(RouteConfig);

RouteConfig.$inject = ['$routeProvider'];

function RouteConfig($routeProvider){
	$routeProvider.when('/',{ templateUrl : "templates/welcome.html"});
	$routeProvider.when('/acceso',{ templateUrl : "templates/adminAccess.html"});
	$routeProvider.when('/cinemas/:id',{ templateUrl : "templates/cinema.html"});
	$routeProvider.when('/videojuegos',{ templateUrl : "templates/videojuegos.html"});
	$routeProvider.when('/libros',{ templateUrl : "templates/libros.html"});
	$routeProvider.when('/movies',{ templateUrl : "templates/peliculas.html"});
}