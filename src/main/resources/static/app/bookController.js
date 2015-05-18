angular.module("app").controller("bookController", bookController);

bookController.$inject = ["bookService", "$routeParams", "$location", "LxNotificationService"];

function bookController(bookService, $routeParams, $location, LxNotificationService) {

	var vm = this;
	
	//View model properties
	vm.books=[];
	
		
	//Controller logic
	
	vm.books= bookService.getBooks();
	
	
	//Controller actions
	
};

