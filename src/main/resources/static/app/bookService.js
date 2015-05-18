angular.module("app").factory("bookService", bookService);

bookService.$inject = [ "$resource", "$timeout" ];

function bookService($resource, $timeout) {

	var BookResource = $resource('/books/:id', {
		id : '@id'
	}, {
		update : {
			method : "PUT"
		}
	});
	
	var BookResource2 = $resource('/books/:id', {
		id : '@id'
	}, {
		update : {
			method : "GET"
		}
	});

	var books = [];

	function autoreload(){
		reload();
		$timeout(autoreload, 5000);
	}
	
	autoreload();
	
	return {
		reload : reload,
		getBooks : getBooks,
		getBook : getBook,		
		newBook : newBook,
		updateBook : updateBook,
		deleteBook : deleteBook
	}

	function reload(){
		var promise = BookResource.query(function(newBooks){
			books.length = 0;
			books.push.apply(books, newBooks);
		}).$promise;
		return promise;
	}
	
	function getBooks() {
		return books;
	}

	function getBook(id) {
		
		
		for (var i = 0; i < books.length; i++) {
			if (books[i].id.toString() === id) {
				return books[i];
			}
		}
	}

	function newBook(newBook) {
		new BookResource(newBook).$save(function(book) {
			books.push(book);
		});
	}

	function updateBook(updatedBook) {
		updatedBook.$update();
	}

	function deleteBook(book) {
		book.$remove(function() {
			books.splice(books.indexOf(book), 1);
		});
	}	
}