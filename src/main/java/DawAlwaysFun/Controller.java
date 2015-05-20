package DawAlwaysFun;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
		game.setCategory("SHOOTER");
		game.setDescription("Juego ultramoderno basado en las guerras futuristas");
		game.setPlatform("PS4");
		game.setPublisher("EA");
		game.setDevelopment("Equipo daw");
		game.setImage("battle.png");
		serviceDawFun.setVideogame(game);
		
		Videogame game2 = new Videogame();
		game2.setName("Plats 3");
		game2.setPegi_age(12);
		game2.setCategory("TERCERA PERSONA");
		game2.setDescription("Lo mejor para pasar la vida en casa jugando con la familia");
		game2.setPlatform("PC");
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
		movie.setType("ACCION");
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
		movie2.setType("DRAMA");
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
		movie3.setType("ACCION");
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
		movie4.setType("COMEDIA");
		serviceDawFun.setMovie(movie4);
		
		
		Thepark park = new Thepark();
		park.setAddress_park("Casa de campo");
		park.setCheck_park(true);
		park.setClose_park("1:00");
		park.setDescription_park("El Parque de Atracciones de Madrid es el parque de atracciones de la ciudad de Madrid, situado en el parque de la Casa de Campo, concretamente en la zona de Batán. El parque cuenta con dos puertas de acceso: la principal y la de la zona infantil");
		park.setImage_park("parqueAtracciones.jpg");
		park.setKind_park("Atracciones");
		park.setName_park("Parque de Atracciones");
		park.setOpen_park("12:00");
		park.setPrice_park(31);
		park.setProvince_park("Madrid");
		serviceDawFun.setPark(park);
		
		Thepark park2 = new Thepark();
		park2.setAddress_park("Torrejon de Ardoz");
		park2.setCheck_park(true);
		park2.setClose_park("1:00");
		park2.setDescription_park("La warner es el mejor de los parques tematicos para pasarlo en familia");
		park2.setImage_park("warner.png");
		park2.setKind_park("Atracciones");
		park2.setName_park("Parque Warner");
		park2.setOpen_park("12:00");
		park2.setPrice_park(31);
		park2.setProvince_park("Madrid");
		serviceDawFun.setPark(park2);
		
		Thepark park3 = new Thepark();
		park3.setAddress_park("Villanueva de la Cañada");
		park3.setCheck_park(true);
		park3.setClose_park("20:00");
		park3.setDescription_park("El mejor lugar para ir con los amigos y disfrutar de las mejores atracciones acuaticas");
		park3.setImage_park("aquopolis.jpg");
		park3.setKind_park("Acuaticos");
		park3.setName_park("Aquopolis");
		park3.setOpen_park("12:00");
		park3.setPrice_park(25);
		park3.setProvince_park("Madrid");
		serviceDawFun.setPark(park3);
		
		Local local = new Local();
		local.setAddress("Calle arcipreste de Hita");
		local.setCapacity(100);
		local.setClose_time("2:00");
		local.setDescripcion("Comida rica");
		local.setLocal_type("RESTAURANTE");
		local.setName("La castellaneda");
		local.setOpen_time("8:00");
		local.setPhoto("castellano.png");
		local.setPrice_medium(50);
		local.setProvince("Madrid");
		local.setStar(10);
		serviceDawFun.setLocal(local);
		
		Local local2 = new Local();
		local2.setAddress("Calle mostoles");
		local2.setCapacity(250);
		local2.setClose_time("2:00");
		local2.setDescripcion("Comida sana");
		local2.setLocal_type("PUB");
		local2.setName("El pato mojao");
		local2.setOpen_time("8:00");
		local2.setPhoto("patomojao.png");
		local2.setPrice_medium(25);
		local2.setProvince("Madrid");
		local2.setStar(15);
		serviceDawFun.setLocal(local2);
		
		Outdoor_activity actividad = new Outdoor_activity();
		actividad.setAge_recomended(18);
		actividad.setDescription("Un viaje en globo apasionante");
		actividad.setDuration(180);
		actividad.setImage_activity("globo.png");
		actividad.setName("Viaje en globo");
		actividad.setPrice(250);
		actividad.setRisk("BAJO");
		actividad.setAddress("Pradera de san isidro");
		serviceDawFun.setOutdoor(actividad);
		
		Outdoor_activity actividad2 = new Outdoor_activity();
		actividad2.setAge_recomended(18);
		actividad2.setDescription("Una caida libre desde el cielo");
		actividad2.setDuration(50);
		actividad2.setImage_activity("paraca.png");
		actividad2.setName("Paracaidismo");
		actividad2.setPrice(500);
		actividad2.setRisk("ALTO");
		actividad2.setAddress("Alto de Alcorcon");
		serviceDawFun.setOutdoor(actividad2);
		
			
		
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
	public ResponseEntity<Thepark> addPark(@RequestBody Thepark park){
		serviceDawFun.setPark(park);
		return new ResponseEntity<>(park, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/parks", method = RequestMethod.GET)
	public List<Thepark> getParks(){
		return serviceDawFun.getParks();
	}
	
	@RequestMapping(value = "/park/{idPark}", method = RequestMethod.GET)
	public Thepark getPark(@PathVariable long idPark){
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
	
	@RequestMapping(value = "/access/{nom}/{pass}", method = RequestMethod.GET)
	public boolean validateAdmin(@PathVariable String	nom, @PathVariable String	pass){
		System.out.println("dasd"+nom+pass);
		if(nom.equals("admin")&&pass.equals("1234")){			
			user.setAdmin(true);			
		}
		System.out.println(user.isAdmin());
		return user.isAdmin();		
		
	}
	
	@RequestMapping(value = "/access/", method = RequestMethod.POST)
	public @ResponseBody boolean validateAdmin2(@RequestBody String cuerpo){
		
		System.out.println(cuerpo);
		boolean esAdmin = cuerpo.contentEquals("nom=admin&pass=1234");
		System.out.println(esAdmin);
		
		user.setAdmin(esAdmin);
		
		System.out.println("La sesion es: "+user.isAdmin());
		return user.isAdmin();		
		
	}
	
	
	
	
	
}
