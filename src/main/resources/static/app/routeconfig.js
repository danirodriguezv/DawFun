angular.module("app").config(RouteConfig);

RouteConfig.$inject = ['$routeProvider'];

function RouteConfig($routeProvider){
	$routeProvider.when('/',{ templateUrl : "templates/welcome.html"});
	$routeProvider.when('/acceso',{ templateUrl : "templates/adminAccess.html"});
	$routeProvider.when('/cinemas/:id',{ templateUrl : "templates/cinema.html"});
	$routeProvider.when('/videojuegos',{ templateUrl : "templates/videojuegos.html"});
	$routeProvider.when('/libros',{ templateUrl : "templates/libros.html"});
	$routeProvider.when('/movies',{ templateUrl : "templates/peliculas.html"});
	$routeProvider.when('/admin',{ templateUrl : "templates/adminAccess.html"});
	$routeProvider.when('/promocionate',{ templateUrl : "templates/promocionate.html"});
	$routeProvider.when('/parques',{ templateUrl : "templates/parques.html"});
	$routeProvider.when('/locales',{ templateUrl : "templates/locales.html"});
	$routeProvider.when('/riesgo',{ templateUrl : "templates/riesgo.html"});

	$routeProvider.when('/access/:nom/:pass',{ templateUrl : "templates/welcome.html"});
}