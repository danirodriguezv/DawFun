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
		libro.setWriter("David Retamal el puto amo");
		libro.setGenre("Erotico");
		libro.setImage("livro.jpg");
		libro.setPublisher("Anaya");
		libro.setPageNumber(230);
		libro.setSynopsis("Un libro de misterio que contiene 1, dos , 3 o mas embarazos.");
		libro.setIsbn("ISD-3123");
		serviceDawFun.setBook(libro);
		
		Book libro2 = new Book();
		libro2.setTitle("La sagrada Biblia");
		libro2.setWriter("Jesus al bajar de la cruz");
		libro2.setGenre("Fantastico");
		libro2.setImage("livro.jpg");
		libro2.setPublisher("Suma de letras");
		libro2.setPageNumber(130);
		libro2.setSynopsis("Un libro de puta madre con gente que bebe vino, resucita peña muerta y es traicionado por un amigo.");
		libro2.setIsbn("IVD-3413");
		serviceDawFun.setBook(libro2);
		
		Videogame game = new Videogame();
		game.setName("Battlefield 3");
		game.setPegi_age(16);
		game.setCategory("GUERRA");
		game.setDescription("Juego ultramoderno basado en las guerras futuristas");
		game.setPlatform("DISPAROS");
		game.setPublisher("EA");
		game.setDevelopment("Equipo daw");
		game.setImage("battle.png");
		serviceDawFun.setVideogame(game);
		
		Videogame game2 = new Videogame();
		game2.setName("Plats 3");
		game2.setPegi_age(12);
		game2.setCategory("TERCERA PERSONA");
		game2.setDescription("Lo mejor para pasar la vida en casa jugando con la familia");
		game2.setPlatform("ROL");
		game2.setPublisher("IA");
		game2.setDevelopment("Equipo plantoso");
		game2.setImage("plants.png");
		serviceDawFun.setVideogame(game2);
		
		Movie movie = new Movie();
		movie.setDescription("La ultima pelicula de los heroes mas heroicos, los autenticos Vengadores");
		movie.setDirector("Michael doogleas");
		movie.setDuration(122);
		movie.setLeading_actor("Jason Stazam");
		movie.setMovie_trailer("De momento sin trailer");
		movie.setPhoto("vengadores.png");
		movie.setProduction("WarnerBros");
		movie.setTitle("Los vengadores, la era de ultron");
		serviceDawFun.setMovie(movie);
		
		Movie movie2 = new Movie();
		movie2.setDescription("Una historia increible sobre el señor el cual llamaron el maestro del agua");
		movie2.setDirector("Doroti");
		movie2.setDuration(100);
		movie2.setLeading_actor("Rousel Crowel");
		movie2.setMovie_trailer("De momento sin trailer");
		movie2.setPhoto("magua.png");
		movie2.setProduction("WarnerBros");
		movie2.setTitle("El maestro de agua");
		serviceDawFun.setMovie(movie2);
		
		Movie movie3 = new Movie();
		movie3.setDescription("Una precisa y emocionante carrera de coches");
		movie3.setDirector("Gamsta");
		movie3.setDuration(95);
		movie3.setLeading_actor("Mulatillo");
		movie3.setMovie_trailer("De momento sin trailer");
		movie3.setPhoto("atodogas.png");
		movie3.setProduction("WarnerBros");
		movie3.setTitle("A todo gas, el mañana");
		serviceDawFun.setMovie(movie3);
		
		Movie movie4 = new Movie();
		movie4.setDescription("Historia de novita y doraemon");
		movie4.setDirector("Hulito");
		movie4.setDuration(88);
		movie4.setLeading_actor("PapaJoe");
		movie4.setMovie_trailer("De momento sin trailer");
		movie4.setPhoto("novita.png");
		movie4.setProduction("WarnerBros");
		movie4.setTitle("Novita y el gato cosmico");
		serviceDawFun.setMovie(movie4);
		
		Local local = new Local();
		local.setAddress("Calle arcipreste de Hita");
		local.setCapacity(100);
		local.setClose_time("2:00");
		local.setFood_type("Comida rica");
		local.setLocal_type("RESTAURANTE");
		local.setName("La castellaneda");
		local.setOpen_time("8:00");
		local.setPhoto("castellano.png");
		local.setPrice_medium(50);
		local.setProvice("Madrid");
		local.setStar(10);
		serviceDawFun.setLocal(local);
		
		Local local2 = new Local();
		local2.setAddress("Calle mostoles");
		local2.setCapacity(250);
		local2.setClose_time("2:00");
		local2.setFood_type("Comida sana");
		local2.setLocal_type("PUB");
		local2.setName("El pato mojao");
		local2.setOpen_time("8:00");
		local2.setPhoto("patomojao.png");
		local2.setPrice_medium(25);
		local2.setProvice("Madrid");
		local2.setStar(15);
		serviceDawFun.setLocal(local2);
		
			
		
	}
	
	//Metodos del controlador de libros
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		serviceDawFun.setBook(book);
		System.out.println("entra3");
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/books", method = RequestMethod.GET) //entra aqui si pide getBooks
	public List<Book> getBooks(){
		System.out.println("entra2");
		return serviceDawFun.getBooks();
	}
	
	@RequestMapping(value = "/books/{idBook}", method = RequestMethod.GET)
	public Book getBook(@PathVariable long idBook){
		System.out.println("entra");
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
