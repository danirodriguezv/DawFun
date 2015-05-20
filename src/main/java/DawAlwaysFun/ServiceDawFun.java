package DawAlwaysFun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDawFun {
	
	@Autowired
	private MovieRepository repoMovies;	
	
	@Autowired
	private UserRepository repoUsers;
	
	@Autowired
	private BookRepository repoBooks;
	
	@Autowired
	private LocalRepository repoLocals;
	
	@Autowired
	private OutdoorRepository repoOutdoors;
	
	public MovieRepository getRepoMovies() {
		return repoMovies;
	}

	public void setRepoMovies(MovieRepository repoMovies) {
		this.repoMovies = repoMovies;
	}

	public UserRepository getRepoUsers() {
		return repoUsers;
	}

	public void setRepoUsers(UserRepository repoUsers) {
		this.repoUsers = repoUsers;
	}

	public BookRepository getRepoBooks() {
		return repoBooks;
	}

	public void setRepoBooks(BookRepository repoBooks) {
		this.repoBooks = repoBooks;
	}

	public LocalRepository getRepoLocals() {
		return repoLocals;
	}

	public void setRepoLocals(LocalRepository repoLocals) {
		this.repoLocals = repoLocals;
	}

	public OutdoorRepository getRepoOutdoors() {
		return repoOutdoors;
	}

	public void setRepoOutdoors(OutdoorRepository repoOutdoors) {
		this.repoOutdoors = repoOutdoors;
	}

	public TheParkRepository getRepoParks() {
		return repoParks;
	}

	public void setRepoParks(TheParkRepository repoParks) {
		this.repoParks = repoParks;
	}

	@Autowired
	private TheParkRepository repoParks;
	
	@Autowired
	private VideogameRepository repoVideogames;
	
	//Metodos para la obtencion de todos los objetos en la base de datos
	
	public List<Movie> getMovies(){
		return (List<Movie>) repoMovies.findAll();
	}
	
	public List<User> getUsers(){
		return (List<User>) repoUsers.findAll();
	}
	
	public List<Book> getBooks(){
		return (List<Book>) repoBooks.findAll();
	}
	
	public List<Local> getLocals(){
		return (List<Local>) repoLocals.findAll();
	}
	
	public List<Outdoor_activity> getOutdoors(){
		return (List<Outdoor_activity>) repoOutdoors.findAll();
	}
	
	public List<Thepark> getParks(){
		return (List<Thepark>) repoParks.findAll();
	}
	
	public List<Videogame> getVideogames(){
		return (List<Videogame>) repoVideogames.findAll();
	}
	
	//Busquedas por objetos determinados de la base de datos
	
	public Movie getMovie(long idMovie){
		return repoMovies.findOne(idMovie);
	}
	
	public User getUser(long idUser){
		return repoUsers.findOne(idUser);
	}
	
	public Book getBook(long idBook){
		return repoBooks.findOne(idBook);
	}
	
	public Local getLocal(long idLocal){
		return repoLocals.findOne(idLocal);
	}
	
	public Outdoor_activity getOutdoor(long idOutdoor){
		return repoOutdoors.findOne(idOutdoor);
	}
	
	public Thepark getPark(long idPark){
		return repoParks.findOne(idPark);
	}
	
	public Videogame getVideogame(long idVideogame){
		return repoVideogames.findOne(idVideogame);
	}
	
	//Metodos para rellenar la base de datos
	
	public void setMovie(Movie movie){
		repoMovies.save(movie);
	}
	
	public void setUser(User user){
		repoUsers.save(user);
	}
	
	public void setBook(Book book){
		repoBooks.save(book);
	}
	
	public void setLocal(Local local){
		repoLocals.save(local);
	}
	
	public void setOutdoor(Outdoor_activity activity){
		repoOutdoors.save(activity);
	}
	
	public void setPark(Thepark park){
		repoParks.save(park);
	}

	public void setVideogame(Videogame videogame){
		repoVideogames.save(videogame);
	}

	public VideogameRepository getRepoVideogames() {
		return repoVideogames;
	}

	public void setRepoVideogames(VideogameRepository repoVideogames) {
		this.repoVideogames = repoVideogames;
	}
	
	
	/**/
	
}
	
	


