package DawAlwaysFun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDawKine {
	
	@Autowired
	private MovieRepository repoMovies;	
	
	@Autowired
	private UserRepository repoUsers;
	
	@Autowired
	private DirectorRepository repoDirectors;
	
	@Autowired
	private CinemaRepository repoCinemas;
	
	//Metodos del repositorio de las peliculas
	
	public void setMovie(Movie movie){
		repoMovies.save(movie);
	}
	
	public List<Movie> getMovies(){
		return (List<Movie>) repoMovies.findAll();
	}
	
	public Movie getMovie(long idMovie){
		return repoMovies.findOne(idMovie);
	}
	
	//Metodos del repositorio de los usuarios
	public void setUser(User user){
		repoUsers.save(user);
	}
	
	public List<User> getUsers(){
		return (List<User>) repoUsers.findAll();
	}
	
	public User getUser(long idUser){
		return repoUsers.findOne(idUser);
	}
	
	//Metodos del repositorio de los directores
	public void setDirector(Director director){
		repoDirectors.save(director);
	}
	
	public List<Director> getDirectors(){
		return (List<Director>) repoDirectors.findAll();
	}
	
	public Director getDirector(long idDirector){
		return repoDirectors.findOne(idDirector);
	}
	
	//Metodos del repositorio de los cines
	public void setCinema(Cinema cinema){
		repoCinemas.save(cinema);
	}
	
	public List<Cinema> getCinemas(){
		return (List<Cinema>) repoCinemas.findAll();
	}
	
	public Cinema getCinema(long idCinema){
		return repoCinemas.findOne(idCinema);
	}
	

}
	
	


