angular.module("app").controller("promocionateController", promocionateController);

promocionateController.$inject = ["bookService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function promocionateController(bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
		
		
	//Controller logic
	
	
	
	
	
	
	//Controller actions
	
	vm.opendDialog = function(dialogId,book)
	{
		vm.tituloSelec=book.title;
		vm.autorSelec=book.writer;
		vm.imagenSelec=book.image;
		vm.editorSelec=book.publisher;
		vm.resumenSelec=book.synopsis;
		vm.isbn=book.isbn;
		vm.pageNumberSelec=book.pageNumber;
	    LxDialogService.open(dialogId);
	};

	vm.closingDialog = function()
	{
	   
	    LxNotificationService.notify('Visto!', 'emoticon', false, 'yellow');
	};
	
	vm.volver= function(){
		$location.path("/");
	}
	vm.ir= function(sitio){
		$location.path("/"+sitio);
	}
	
};
