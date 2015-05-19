angular.module("app").controller("bookController", bookController);

bookController.$inject = ["bookService", "$routeParams", "$location", "LxNotificationService","LxDialogService"];






function bookController(bookService, $routeParams, $location, LxNotificationService,LxDialogService) {

	var vm = this;
	
	//View model properties
	vm.books=[];
	
		
	//Controller logic
	
	vm.books= bookService.getBooks();
	
	vm.objetivoBusqueda='Todos';
	vm.ordenadoPor="title";
	vm.categorias=["Terror","Fantastico","Ciencia Ficcion","Juvenil","Humanistico","Romantica","Poesia","Novela Negra","Otros"];
	vm.sugerencia;
	
	
	
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
		
		vm.objetivoBusqueda=categoria;
	}
	
	vm.indicarOrden = function(orden){
		vm.ordenadoPor=orden;
	}
	
	vm.abrirDialogSugerencia = function(dialogId){
		LxDialogService.open(dialogId);
	}
	
	vm.uploadFile = function(){
		var name = vm.name;
		var file = vm.file;
		console.log(name);
		console.log(file);
		
	}
	
	
	
	
	

	
	
};

