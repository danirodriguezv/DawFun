package DawAlwaysFun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String title;
	private String director;
	private String leading_actor;
	private String production;
	private long duration;
	private String description;
	private String movie_trailer;
	private String photo;
	private String type;
	private String class_type;
	private int recomendado;
	
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLeading_actor() {
		return leading_actor;
	}
	public void setLeading_actor(String leading_actor) {
		this.leading_actor = leading_actor;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getMovie_trailer() {
		return movie_trailer;
	}
	public void setMovie_trailer(String movie_trailer) {
		this.movie_trailer = movie_trailer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getRecomendado() {
		return recomendado;
	}
	public void setRecomendado(int recomendado) {
		this.recomendado = recomendado;
	}
}