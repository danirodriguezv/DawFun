angular.module("app").config(RouteConfig);

RouteConfig.$inject = ['$routeProvider'];

function RouteConfig($routeProvider){
	$routeProvider.when('/',{ templateUrl : "templates/welcome.html"});
	$routeProvider.when('/acceso',{ templateUrl : "templates/adminAccess.html"});
	$routeProvider.when('/videojuegos',{ templateUrl : "templates/videojuegos.html"});
	$routeProvider.when('/libros',{ templateUrl : "templates/libros.html"});
	$routeProvider.when('/movies',{ templateUrl : "templates/peliculas.html"});
	$routeProvider.when('/admin',{ templateUrl : "templates/adminAccess.html"});

	$routeProvider.when('/parques',{ templateUrl : "templates/parques.html"});
	$routeProvider.when('/locales',{ templateUrl : "templates/locales.html"});
	$routeProvider.when('/outdoors',{ templateUrl : "templates/actividadesR.html"});
	$routeProvider.when('/panelAdmin',{ templateUrl : "templates/panelAdministracion.html"});
	$routeProvider.when('/acercaDe',{ templateUrl : "templates/acercaDe.html"});
	
}