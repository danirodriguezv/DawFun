angular.module("app").controller("bookController", bookController);

bookController.$inject = ["bookService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function bookController(bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.books=[];
	
		
	//Controller logic
	
	vm.books= bookService.getBooks();
	
	vm.objetivoBusqueda='Todos';
	
	
	
	
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
	
	vm.busqueda = function(categoria){
		if (categoria === 'Fantastico'){
			vm.objetivoBusqueda='Fantastico';
		}else if(categoria === 'Todos'){
			vm.objetivoBusqueda='Todos';
		}
	}
};

