angular.module("app").service("bookService", bookService);

bookService.$inject = [ "$resource"];

function bookService($resource) {

		this.books =[];
		
		var BookResource = $resource('books/:id',{id: '@id'},{update:{method:"PUT"}});
		
	
		this.getBooks = function(){
			books = BookResource.query();
			return books;
		}
		
		
		
}