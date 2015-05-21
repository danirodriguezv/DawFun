angular.module("app").service("bookService", bookService);

bookService.$inject = [ "$resource","$http","LxNotificationService"];

function bookService($resource,$http,LxNotificationService) {

		this.books =[];
		
		
		var BookResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});
		
		//var BooResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});

	
		this.getBooks = function(){
			books = BookResource.query();
			return books;
		}
		
		this.getBooks = function(id){
			book = BookResource.query(id);
			return book;
		}
		
		this.deleteBook=function(book) {				
			//$http.delete('/videogames/'+ video.id);
			
			$http.delete('/books/'+ book.id).success(function (d) { 					
				if(d===true){
					LxNotificationService.notify('Borrado Correctamente', 'emoticon', false, 'green');
				}else{
					LxNotificationService.notify('Error al borrar, actualizar pagina', 'emoticon', false, 'red');
				}
				
			});	
				
		}
		
		this.addLibro=function(libro) {			
			new BookResource(libro).$save(function(post) {
				this.books.push(post);
				LxNotificationService.notify('Añadido Correctamente', 'emoticon', false, 'green');
			});
			
		}

		
		
		
}