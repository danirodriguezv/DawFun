angular.module("app").controller("bookController", bookController);

bookController.$inject = ["bookService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function bookController(bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.books=[];
	
		
	//Controller logic
	
	vm.books= bookService.getBooks();
	vm.nombreSelec;
	
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,book)
	{
		vm.nombreSelec=book.title;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Dialog cerrado!');
	};
	
	
	
};

