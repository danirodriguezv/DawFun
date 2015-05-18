package DawAlwaysFun;

import java.util.List;



import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller implements CommandLineRunner {

	
	@Autowired
	private User user; //sesion de usuario por defecto admin es falso y cesta vacia
	
	@Autowired
	private ServiceDawFun serviceDawFun;


	
	
	@Override
	public void run(String... args) throws Exception {
		
		/* QUITAR PARA AÑADIR PRODUCTOS POR DEFECTO EN LA BD
		
		*/
		Book libro = new Book();
		libro.setTitle("Libro de la ostia");
		serviceDawFun.setBook(libro);
		
	}
	
	//Metodos del controlador de libros
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		serviceDawFun.setBook(book);
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getBooks(){
		return serviceDawFun.getBooks();
	}
	
	@RequestMapping(value = "/book/{idBook}", method = RequestMethod.GET)
	public Book getBook(@PathVariable long idBook){
		return serviceDawFun.getBook(idBook);
	}
	
	//Metodos del controlador de las peliculas
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		serviceDawFun.setMovie(movie);
		return new ResponseEntity<>(movie, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getMovies(){
		return serviceDawFun.getMovies();
	}
	
	@RequestMapping(value = "/movie/{idMovie}", method = RequestMethod.GET)
	public Movie getMovie(@PathVariable long idMovie){
		return serviceDawFun.getMovie(idMovie);
	}
	
	//Metodos del controlador de outdoors
	@RequestMapping(value = "/outdoors", method = RequestMethod.POST)
	public ResponseEntity<Outdoor_activity> addOutdoor(@RequestBody Outdoor_activity activity){
		serviceDawFun.setOutdoor(activity);
		return new ResponseEntity<>(activity, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/outdoors", method = RequestMethod.GET)
	public List<Outdoor_activity> getOutdoors(){
		return serviceDawFun.getOutdoors();
	}
	
	@RequestMapping(value = "/outdoor/{idActivity}", method = RequestMethod.GET)
	public Outdoor_activity getOutdoor(@PathVariable long idActivity){
		return serviceDawFun.getOutdoor(idActivity);
	}
	
	//Metodos del controlador de los parques tematicos
	
	@RequestMapping(value = "/parks", method = RequestMethod.POST)
	public ResponseEntity<Theme_park> addPark(@RequestBody Theme_park park){
		serviceDawFun.setPark(park);
		return new ResponseEntity<>(park, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/parks", method = RequestMethod.GET)
	public List<Theme_park> getParks(){
		return serviceDawFun.getParks();
	}
	
	@RequestMapping(value = "/park/{idPark}", method = RequestMethod.GET)
	public Theme_park getPark(@PathVariable long idPark){
		return serviceDawFun.getPark(idPark);
	}
	
	//Metodos del controlador de los videojuegos
	
	@RequestMapping(value = "/videogames", method = RequestMethod.POST)
	public ResponseEntity<Videogame> addVideogame(@RequestBody Videogame videogame){
		serviceDawFun.setVideogame(videogame);
		return new ResponseEntity<>(videogame, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/videogames", method = RequestMethod.GET)
	public List<Videogame> getVideogames(){
		return serviceDawFun.getVideogames();
	}
	
	@RequestMapping(value = "/videogame/{idVideogame}", method = RequestMethod.GET)
	public Videogame getVideogame(@PathVariable long idVideogame){
		return serviceDawFun.getVideogame(idVideogame);
	}
	
	
	
	
	//Metodos del controlador de los locales

	
	@RequestMapping(value = "/locals", method = RequestMethod.POST)
	public ResponseEntity<Local> addLocal(@RequestBody Local local){
		serviceDawFun.setLocal(local);
		return new ResponseEntity<>(local, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/locals", method = RequestMethod.GET)
	public List<Local> getLocals(){
		return serviceDawFun.getLocals();
	}
	
	@RequestMapping(value = "/local/{idLocal}", method = RequestMethod.GET)
	public Local getCinema(@PathVariable long idLocal){
		return serviceDawFun.getLocal(idLocal);
	}
	
	//Metodos del controlador de usuarios

	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		return serviceDawFun.getUsers();
	}
	
	@RequestMapping(value = "/user/{idUser}", method = RequestMethod.GET)
	public User getUser(@PathVariable long idUser){
		return serviceDawFun.getUser(idUser);
	}
	
	//Metodos del controlador de admin
	
	@RequestMapping(value = "/access", method = RequestMethod.GET)
	public boolean validateAdmin(@RequestParam String	nom, @RequestParam String	pass){
		
		if(nom.equals("admin")&&pass.equals("1234")){			
			user.setAdmin(true);			
		}
		
		return user.isAdmin();
		
		//return serviceDawKine.getMovie(idMovie);
	}
}
