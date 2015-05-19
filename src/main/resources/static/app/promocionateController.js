angular.module("app").controller("promocionateController", promocionateController);

promocionateController.$inject = ["bookService", "promocionateService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];

function promocionateController(bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.books=[];
	vm.provinces=["madrid","albacete"];
		
	//Controller logic
	
	vm.books= bookService.getBooks();
	
	vm.objetivoBusqueda='Todos';
	vm.ordenadoPor="title";
	
	
	
	
	//Controller actions
	
vm.addRequest = function(newRequest) {
		
		promocionateService.newRequest(newRequest);
		
		vm.newRequest = {};
		
		$location.path("/");
	};
	
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
		
		vm.objetivoBusqueda=categoria;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor=orden;
	}
};
