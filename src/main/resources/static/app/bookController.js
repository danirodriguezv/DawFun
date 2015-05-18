angular.module("app").controller("bookController", bookController);

bookController.$inject = ["bookService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function bookController(bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.books=[];
	
		
	//Controller logic
	
	vm.books= bookService.getBooks();
	
	vm.tituloSelec;
	vm.autorSelec;
	vm.simagenSelec;
	
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,book)
	{
		vm.tituloSelec=book.title;
		vm.autorSelec=book.writer;
		vm.imagenSelec=book.image;
		vm.editorSelec=book.publisher;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	    LxNotificationService.info('Dialog cerrado!');
	};
	
	
	
};

