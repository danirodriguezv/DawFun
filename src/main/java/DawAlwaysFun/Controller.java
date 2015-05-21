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
		libro.setTitle("El ingenioso hidalgo Don Quijote de la Mancha");
		libro.setWriter("Miguel de Cervantes");
		libro.setGenre("Otros");
		libro.setImage("quijote.jpg");
		libro.setPublisher("ESPASA LIBROS");
		libro.setPageNumber(1560);
		libro.setSynopsis("Es la historia de un hidalgo de la Mancha de unos 50 años que tras leer muchos libros de caballería, un género popular en siglo XVI, decide disfrazarse de caballero andante y embarcarse en una serie de aventuras con su viejo caballo Rocinante");
		libro.setIsbn("9788467035704");
		libro.setClass_type("LIBRO");
		serviceDawFun.setBook(libro);
		
		Book libro2 = new Book();
		libro2.setTitle("1984");
		libro2.setWriter("George Orwell");
		libro2.setGenre("Ciencia Ficcion");
		libro2.setImage("1984.jpg");
		libro2.setPublisher("AUSTRAL");
		libro2.setPageNumber(326);
		libro2.setSynopsis("Inquietante interpretacion futurista basada en la critica a los totalitarismos y a la opresion del poder, situada en 1984 en la sociedad inglesa");
		libro2.setIsbn("9788423342310");
		libro2.setClass_type("LIBRO");
		serviceDawFun.setBook(libro2);
		
		Book libro3 = new Book();
		libro3.setTitle("Cien años de soledad");
		libro3.setWriter("Gabriel Garcia Marquez");
		libro3.setGenre("Otros");
		libro3.setImage("cien.jpg");
		libro3.setPublisher("ALFAGUARA");
		libro3.setPageNumber(471);
		libro3.setSynopsis("Una de las aventuras literarias mas fascinantes de nuestro siglo");
		libro3.setIsbn("9788420471839");
		libro3.setClass_type("LIBRO");
		serviceDawFun.setBook(libro3);

		Book libro4 = new Book();
		libro4.setTitle("Dracula");
		libro4.setWriter("Bram Stoker");
		libro4.setGenre("Terror");
		libro4.setImage("dracula.jpg");
		libro4.setPublisher("DEBOLSILLO");
		libro4.setPageNumber(688);
		libro4.setSynopsis("La novela presenta las anotaciones del diario personal de Jonathan Harker. Un conde de Transilvania llamado Dracula solicita sus servicios como asesor y gestor para la compra de una mansion en Londres");
		libro4.setIsbn("9788483461846");
		libro4.setClass_type("LIBRO");
		serviceDawFun.setBook(libro4);
		
		Book libro5 = new Book();
		libro5.setTitle("El Padrino");
		libro5.setWriter("Mario Puzo");
		libro5.setGenre("Novela Negra");
		libro5.setImage("padrino.jpg");
		libro5.setPublisher("EDICIONES B");
		libro5.setPageNumber(477);
		libro5.setSynopsis("El Padrino narra la historia de un hombre: Vito Corleone, el capo mas respetado de Nueva York");
		libro5.setIsbn("9788466639040");
		libro5.setClass_type("LIBRO");
		serviceDawFun.setBook(libro5);
				
		Videogame game = new Videogame();
		game.setName("Battlefield 3");
		game.setPegi_age(16);
		game.setCategory("SHOOTER");
		game.setDescription("Juego ultramoderno basado en las guerras futuristas");
		game.setPlatform("PS4");
		game.setPublisher("EA");
		game.setDevelopment("Equipo daw");
		game.setImage("battle.png");
		game.setClass_type("VIDEOGAME");
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
		game2.setClass_type("VIDEOGAME");
		serviceDawFun.setVideogame(game2);
		
		Videogame game3 = new Videogame();
		game3.setName("FIFA 15");
		game3.setPegi_age(3);
		game3.setCategory("TERCERA PERSONA");
		game3.setDescription("FIFA 15 recrea con todo detalle el futbol para que los aficionados sientan la emocion del deporte rey como nunca antes");
		game3.setPlatform("XBOX ONE");
		game3.setPublisher("EA");
		game3.setDevelopment("EA SPORTS");
		game3.setImage("fifa15.jpg");
		game3.setClass_type("VIDEOGAME");
		serviceDawFun.setVideogame(game3);
		
		Videogame game4 = new Videogame();
		game4.setName("World of Warcraft: Warlords of Draenor");
		game4.setPegi_age(12);
		game4.setCategory("ROL");
		game4.setDescription("La Horda de Hierro debe ser detenida. Garrosh Grito Infernal ha escapado al pasado y se ha reunido con su padre, Grommash, feroz lider del clan Grito de Guerra. Juntos, convertiran a los clanes orcos de Draenor en una brutal maquina belica");
		game4.setPlatform("PC");
		game4.setPublisher("BLIZZARD ");
		game4.setDevelopment("BLIZZARD ENTERTAINMENT");
		game4.setImage("wow.jpg");
		game4.setClass_type("VIDEOGAME");
		serviceDawFun.setVideogame(game4);
		
		Videogame game5 = new Videogame();
		game5.setName("Star Wars: Battlefront");
		game5.setPegi_age(16);
		game5.setCategory("SHOOTER");
		game5.setDescription("Sumérgete en tus fantasías de combate de Star Wars con Star Wars: Battlefront");
		game5.setPlatform("PC");
		game5.setPublisher("EA");
		game5.setDevelopment("EA GAMES");
		game5.setImage("battlefront.jpg");
		game5.setClass_type("VIDEOGAME");
		serviceDawFun.setVideogame(game5);
		
		Movie movie = new Movie();
		movie.setDescription("La ultima pelicula de los heroes mas heroicos, los autenticos Vengadores");
		movie.setDirector("Joss Whedon");
		movie.setDuration(142);
		movie.setLeading_actor("Robert Downey, Jr.");
		movie.setMovie_trailer("tmeOjFno6Do"); 
		movie.setPhoto("vengadores.png");
		movie.setProduction("Marvel Studios");
		movie.setTitle("Los vengadores: la era de ultron");
		movie.setType("ACCION");
		movie.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie);
		
		Movie movie2 = new Movie();
		movie2.setDescription("Una historia increible sobre el señor el cual llamaron el maestro del agua");
		movie2.setDirector("Russell Crowe");
		movie2.setDuration(111);
		movie2.setLeading_actor("Russell Crowe");
		movie2.setMovie_trailer("hmgFHyDLQwc");
		movie2.setPhoto("magua.png");
		movie2.setProduction("Warner Bros. Pictures");
		movie2.setTitle("El maestro de agua");
		movie2.setType("DRAMA");
		movie2.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie2);
		
		Movie movie3 = new Movie();
		movie3.setDescription("Una precisa y emocionante carrera de coches");
		movie3.setDirector("James Wan");
		movie3.setDuration(137);
		movie3.setLeading_actor("Vin Diesel");
		movie3.setMovie_trailer("_kOED5CCKKc");
		movie3.setPhoto("atodogas.jpg");
		movie3.setProduction("Universal Pictures");
		movie3.setTitle("Fast & Furious 7");
		movie3.setType("ACCION");
		movie3.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie3);
		
		Movie movie4 = new Movie();
		movie4.setDescription("Historia de novita y doraemon");
		movie4.setDirector("Tsutomu Shibayama");
		movie4.setDuration(99);
		movie4.setLeading_actor("Doraemon");
		movie4.setMovie_trailer("hKSMTGzCMEs");
		movie4.setPhoto("novita.gif");
		movie4.setProduction("Toho Company");
		movie4.setTitle("Doraemon y la fabrica de juguetes");
		movie4.setType("COMEDIA");
		movie4.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie4);
		
		
		Movie movie5 = new Movie();
		movie5.setDescription("La accion transcurre en Judea, el año 30. El imperio romano, dueño y señor del mundo conocido, gobierna con mano de hierro sus vastos territorios, entre ellos Judea, sometiendo con dureza a sus moradores");
		movie5.setDirector("William Wyler");
		movie5.setDuration(212);
		movie5.setLeading_actor("Charlton Heston");
		movie5.setMovie_trailer("Ql0c4JD-93c");
		movie5.setPhoto("benHur.jpg");
		movie5.setProduction("Metro-Goldwyn-Mayer");
		movie5.setTitle("Ben-Hur");
		movie5.setType("DRAMA");
		movie5.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie5);
			
		Movie movie6 = new Movie();
		movie6.setDescription("Ambientada en la Inglaterra del futuro (el año 1995, pero visto desde 1965) la pelicula sigue la vida de un carismatico joven de 17 años llamado Alex DeLarge cuyos placeres son escuchar la musica de Beethoven, el sexo y la ultraviolencia");
		movie6.setDirector("Stanley Kubrick");
		movie6.setDuration(136);
		movie6.setLeading_actor("Malcolm McDowell");
		movie6.setMovie_trailer("A1eC4pG8rC0");
		movie6.setPhoto("narMecanica.jpg");
		movie6.setProduction("Warner Bros");
		movie6.setTitle("La naranja mecanica");
		movie6.setType("DRAMA");
		movie6.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie6);
		
		Movie movie7 = new Movie();
		movie7.setDescription("Año 2018. Torrente sale de la carcel, y se encuentra aturdido ante una España convulsa y dividida. Debe encontrar respuestas en su interior para despejar su confusion, y por ello decide convertirse en un 'fuera de la ley'");
		movie7.setDirector("Santiago Segura");
		movie7.setDuration(105);
		movie7.setLeading_actor("Santiago Segura");
		movie7.setMovie_trailer("TEH4G2Qsk2U");
		movie7.setPhoto("torrenteV.jpg");
		movie7.setProduction("Amiguetes Entertainment");
		movie7.setTitle("Torrente V: Operacion Eurovegas");
		movie7.setType("COMEDIA");
		movie7.setClass_type("PELICULA");
		serviceDawFun.setMovie(movie7);
		
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
		park.setClass_type("PARQUE TEMATICO");
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
		park2.setClass_type("PARQUE TEMATICO");
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
		park3.setClass_type("PARQUE TEMATICO");
		serviceDawFun.setPark(park3);
		
		Thepark park4 = new Thepark();
		park4.setAddress_park("Casa de Campo");
		park4.setCheck_park(true);
		park4.setClose_park("22:00");
		park4.setDescription_park("El parque zoologico de Madrid exhibe una coleccion de mas de 6000 animales de mas de 500 especies diferentes");
		park4.setImage_park("zoo.jpg");
		park4.setKind_park("Zoologicos");
		park4.setName_park("Zoo Aquarium de Madrid");
		park4.setOpen_park("10:30");
		park4.setPrice_park(23);
		park4.setProvince_park("Madrid");
		park4.setClass_type("PARQUE TEMATICO");
		serviceDawFun.setPark(park4);
		
		Thepark park5 = new Thepark();
		park5.setAddress_park("Aldea del Fresno");
		park5.setCheck_park(false);
		park5.setClose_park("19:00");
		park5.setDescription_park("Africa queda muy lejos, pero a tan solo 50Km. de Madrid, Safari Madrid le ofrece la posibilidad de observar animales salvajes en libertad, desde su vehiculo");
		park5.setImage_park("safari.png");
		park5.setKind_park("Safaris");
		park5.setName_park("Safari Madrid");
		park5.setOpen_park("10:30");
		park5.setPrice_park(17);
		park5.setProvince_park("Madrid");
		park5.setClass_type("PARQUE TEMATICO");
		serviceDawFun.setPark(park5);
		
		Local local = new Local();
		local.setAddress_local("Calle arcipreste de Hita");
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
		local.setClass_type("LOCAL");
		serviceDawFun.setLocal(local);
		
		Local local2 = new Local();
		local2.setAddress_local("Calle mostoles");
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
		local2.setClass_type("LOCAL");
		serviceDawFun.setLocal(local2);
		
		Local local3 = new Local();
		local3.setAddress_local("Calle Santa Teresa");
		local3.setCapacity(170);
		local3.setClose_time("3:00");
		local3.setDescripcion("Espacio que combina la música rock y pop actual con los grandes clásicos");
		local3.setLocal_type("PUB");
		local3.setName("Chatarra Cocktail Bar");
		local3.setOpen_time("17:00");
		local3.setPhoto("chatarra.jpg");
		local3.setPrice_medium(8);
		local3.setProvince("Madrid");
		local3.setStar(20);
		local3.setClass_type("LOCAL");
		serviceDawFun.setLocal(local3);
		
		Local local4 = new Local();
		local4.setAddress_local("Plaza Angel Carbajo");
		local4.setCapacity(250);
		local4.setClose_time("13:30");
		local4.setDescripcion("El Txistu de Madrid, el de la cocina vasca exquisita, el frecuentado por futbolistas, empresarios y famosos por su calidad; el que esta catalogado como uno de los mejores restaurantes de la ciudad");
		local4.setLocal_type("RESTAURANTE");
		local4.setName("Meson Txistu");
		local4.setOpen_time("23:30");
		local4.setPhoto("txistu.jpg");
		local4.setPrice_medium(63);
		local4.setProvince("Madrid");
		local4.setStar(50);
		local4.setClass_type("LOCAL");
		serviceDawFun.setLocal(local4);
		
		Outdoor_activity actividad = new Outdoor_activity();
		actividad.setAge_recomended(18);
		actividad.setDescription("Un viaje en globo apasionante");
		actividad.setDuration(180);
		actividad.setImage_activity("globo.png");
		actividad.setName("Viaje en globo");
		actividad.setPrice(250);
		actividad.setRisk("MEDIO");
		actividad.setAddress("Pradera de san isidro");
		actividad.setClass_type("ACTIVIDAD");
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
		actividad2.setClass_type("ACTIVIDAD");
		serviceDawFun.setOutdoor(actividad2);
		
		Outdoor_activity actividad3 = new Outdoor_activity();
		actividad3.setAge_recomended(12);
		actividad3.setDescription("Libera adrenalina a solo dos horas de Madrid. Diversion, emocion y trabajo en equipo son las caracteristicas de esta actividad acuatica");
		actividad3.setDuration(180);
		actividad3.setImage_activity("rafting.jpg");
		actividad3.setName("Rafting");
		actividad3.setPrice(35);
		actividad3.setRisk("ALTO");
		actividad3.setAddress("Sierra de Gredos");
		actividad3.setClass_type("ACTIVIDAD");
		serviceDawFun.setOutdoor(actividad3);	
		
		Outdoor_activity actividad4 = new Outdoor_activity();
		actividad4.setAge_recomended(12);
		actividad4.setDescription("Una experiencia inolvidable que te hará repetir");
		actividad4.setDuration(10);
		actividad4.setImage_activity("karts.jpg");
		actividad4.setName("Karts");
		actividad4.setPrice(14);
		actividad4.setRisk("BAJO");
		actividad4.setAddress("Soto del Real");
		actividad4.setClass_type("ACTIVIDAD");
		serviceDawFun.setOutdoor(actividad4);
		
	}
	
	//Metodos del controlador de libros
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		if(user.isAdmin()){
		serviceDawFun.setBook(book);
		}
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/books", method = RequestMethod.PUT)
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
		if(user.isAdmin()){
		serviceDawFun.setBook(book);
		}
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/books", method = RequestMethod.GET) 
	public List<Book> getBooks(){
	
		return serviceDawFun.getBooks();
	}
	
	@RequestMapping(value = "/books/{idBook}", method = RequestMethod.GET)
	public Book getBook(@PathVariable long idBook){		
		return serviceDawFun.getBook(idBook);
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteBook(@PathVariable long id) {
		boolean borrado= false;
		if(user.isAdmin()){
			serviceDawFun.getRepoBooks().delete(id);	
			borrado=true;
		}
		return borrado;
	}
	
	
	
	
	
	//Metodos del controlador de las peliculas
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		if(user.isAdmin()){
		serviceDawFun.setMovie(movie);
		}
		return new ResponseEntity<>(movie, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.PUT)
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
		if(user.isAdmin()){
		serviceDawFun.setMovie(movie);
		}
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
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteMovie(@PathVariable long id) {
		boolean borrado= false;
		if(user.isAdmin()){
			serviceDawFun.getRepoMovies().delete(id);	
			borrado=true;
		}
		return borrado;
	}
	
	
	//Metodos del controlador de outdoors
	@RequestMapping(value = "/outdoors", method = RequestMethod.POST)
	public ResponseEntity<Outdoor_activity> addOutdoor(@RequestBody Outdoor_activity activity){
		if(user.isAdmin()){
			serviceDawFun.setOutdoor(activity);
		}		
		return new ResponseEntity<>(activity, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/outdoors", method = RequestMethod.PUT)
	public ResponseEntity<Outdoor_activity> updateOutdoor(@RequestBody Outdoor_activity activity){
		if(user.isAdmin()){
			serviceDawFun.setOutdoor(activity);
		}		
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
	
	@RequestMapping(value = "/outdoors/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteOutdoor(@PathVariable long id) {
		boolean borrado= false;
		if(user.isAdmin()){
			serviceDawFun.getRepoOutdoors().delete(id);	
			borrado=true;
		}
		return borrado;
	}
	
	//Metodos del controlador de los parques tematicos
	
	@RequestMapping(value = "/parks", method = RequestMethod.POST)
	public ResponseEntity<Thepark> addPark(@RequestBody Thepark park){
		if(user.isAdmin()){
		serviceDawFun.setPark(park);
		}
		return new ResponseEntity<>(park, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/parks", method = RequestMethod.PUT)
	public ResponseEntity<Thepark> updatePark(@RequestBody Thepark park){
		if(user.isAdmin()){
		serviceDawFun.setPark(park);
		}
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
	
	
	@RequestMapping(value = "/parks/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deletePark(@PathVariable long id) {
		boolean borrado= false;
		if(user.isAdmin()){
			serviceDawFun.getRepoParks().delete(id);	
			borrado=true;
		}
		return borrado;
	}
	
	
	//Metodos del controlador de los videojuegos
	
	@RequestMapping(value = "/videogames", method = RequestMethod.POST)
	public ResponseEntity<Videogame> addVideogame(@RequestBody Videogame videogame){
		if(user.isAdmin()){
			serviceDawFun.setVideogame(videogame);
		}		
		return new ResponseEntity<>(videogame, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/videogames", method = RequestMethod.PUT)
	public ResponseEntity<Videogame> updateVideogame(@RequestBody Videogame videogame){			
		if(user.isAdmin()){
			serviceDawFun.setVideogame(videogame);
		}		
		return new ResponseEntity<>(videogame, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/videogames/valorar", method = RequestMethod.PUT)
	public ResponseEntity<Videogame> valorarVideogame(@RequestBody Videogame videogame){			
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
	
	@RequestMapping(value = "/videogames/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteItem(@PathVariable long id) {
		boolean borrado= false;
		if(user.isAdmin()){
			serviceDawFun.getRepoVideogames().delete(id);	
			borrado=true;
		}
		return borrado;
	}
	
	
	
	//Metodos del controlador de los locales

	
	@RequestMapping(value = "/locals", method = RequestMethod.POST)
	public ResponseEntity<Local> addLocal(@RequestBody Local local){
			if(user.isAdmin()){
				serviceDawFun.setLocal(local);
			}		
			return new ResponseEntity<>(local, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/locals", method = RequestMethod.PUT)
	public ResponseEntity<Local> updateLocal(@RequestBody Local local){			
		if(user.isAdmin()){
			serviceDawFun.setLocal(local);
		}		
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
	
	@RequestMapping(value = "/locals/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteLocal(@PathVariable long id) {
		boolean borrado= false;
		if(user.isAdmin()){
			serviceDawFun.getRepoLocals().delete(id);	
			borrado=true;
		}
		return borrado;
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
		
		if(nom.equals("admin")&&pass.equals("1234")){			
			user.setAdmin(true);			
		}

		return user.isAdmin();		
		
	}
	
	@RequestMapping(value = "/access/", method = RequestMethod.POST) 
	public @ResponseBody boolean validateAdmin2(@RequestBody String cuerpo){
		
		
		boolean esAdmin = cuerpo.contentEquals("nom=admin&pass=1234");		
				
		user.setAdmin(esAdmin);		
		
		return user.isAdmin();		
		
	}
	
	@RequestMapping(value = "/disconect", method = RequestMethod.POST) 
	public @ResponseBody boolean disconectAdmin(){
				
		user.setAdmin(false);	
		
		
		return user.isAdmin();		
		
	}
	
	@RequestMapping(value = "/comprobarAdmin", method = RequestMethod.POST) 
	public @ResponseBody boolean comprobarAdmin(){		
		return user.isAdmin();		
		
	}
	
	
	
	
}
