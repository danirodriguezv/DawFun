package DawAlwaysFun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	private String writer_request;
	private int pageNumber_request;
	private String synopsis_request;
	private String genre_request;
	private String isbn_request;
	private int star_request;
	private long price_medium_request;
	private String province_request;
	private int capacity_request;
	private String local_type_request;
	private String title_request;
	private String director_request;
	private String leading_actor_request;
	private String production_request;
	private String movie_trailer_request;
	private String photo_request;
	private int age_recomended_request;
	private String address_request;
	private boolean risk_request;
	private int duration_request;
	private String open_time_request;
	private String close_time_request;
	private long price_request;
	private boolean check_request;
	private String name_request;
	private String development_request;
	private String platform_request;
	private String publisher_request;
	private int pegi_age_request;
	private String category_request;
	private String image_request;
	private String description_request;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWriter() {
		return writer_request;
	}
	public void setWriter(String writer) {
		this.writer_request = writer;
	}
	public int getPageNumber() {
		return pageNumber_request;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber_request = pageNumber;
	}
	public String getSynopsis() {
		return synopsis_request;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis_request = synopsis;
	}
	public String getGenre() {
		return genre_request;
	}
	public void setGenre(String genre) {
		this.genre_request = genre;
	}
	public String getIsbn() {
		return isbn_request;
	}
	public void setIsbn(String isbn) {
		this.isbn_request = isbn;
	}
	public int getStar() {
		return star_request;
	}
	public void setStar(int star) {
		this.star_request = star;
	}
	public long getPrice_medium() {
		return price_medium_request;
	}
	public void setPrice_medium(long price_medium) {
		this.price_medium_request = price_medium;
	}
	public String getProvice() {
		return province_request;
	}
	public void setProvice(String provice) {
		this.province_request = provice;
	}
	public int getCapacity() {
		return capacity_request;
	}
	public void setCapacity(int capacity) {
		this.capacity_request = capacity;
	}
	public String getLocal_type() {
		return local_type_request;
	}
	public void setLocal_type(String local_type) {
		this.local_type_request = local_type;
	}
	public String getTitle() {
		return title_request;
	}
	public void setTitle(String title) {
		this.title_request = title;
	}
	public String getDirector() {
		return director_request;
	}
	public void setDirector(String director) {
		this.director_request = director;
	}
	public String getLeading_actor() {
		return leading_actor_request;
	}
	public void setLeading_actor(String leading_actor) {
		this.leading_actor_request = leading_actor;
	}
	public String getProduction() {
		return production_request;
	}
	public void setProduction(String production) {
		this.production_request = production;
	}
	public String getMovie_trailer() {
		return movie_trailer_request;
	}
	public void setMovie_trailer(String movie_trailer) {
		this.movie_trailer_request = movie_trailer;
	}
	public String getPhoto() {
		return photo_request;
	}
	public void setPhoto(String photo) {
		this.photo_request = photo;
	}
	public int getAge_recomended() {
		return age_recomended_request;
	}
	public void setAge_recomended(int age_recomended) {
		this.age_recomended_request = age_recomended;
	}
	public String getSite() {
		return address_request;
	}
	public void setSite(String site) {
		this.address_request = site;
	}
	public boolean isRisk() {
		return risk_request;
	}
	public void setRisk(boolean risk) {
		this.risk_request = risk;
	}
	public int getDuration() {
		return duration_request;
	}
	public void setDuration(int duration) {
		this.duration_request = duration;
	}
	public String getAddress() {
		return address_request;
	}
	public void setAddress(String address) {
		this.address_request = address;
	}
	public String getOpen_time() {
		return open_time_request;
	}
	public void setOpen_time(String open_time) {
		this.open_time_request = open_time;
	}
	public String getClose_time() {
		return close_time_request;
	}
	public void setClose_time(String close_time) {
		this.close_time_request = close_time;
	}
	public long getPrice() {
		return price_request;
	}
	public void setPrice(long price) {
		this.price_request = price;
	}
	public boolean isCheck() {
		return check_request;
	}
	public void setCheck(boolean check) {
		this.check_request = check;
	}
	public String getName() {
		return name_request;
	}
	public void setName(String name) {
		this.name_request = name;
	}
	public String getDevelopment() {
		return development_request;
	}
	public void setDevelopment(String development) {
		this.development_request = development;
	}
	public String getPlatform() {
		return platform_request;
	}
	public void setPlatform(String platform) {
		this.platform_request = platform;
	}
	public String getPublisher() {
		return publisher_request;
	}
	public void setPublisher(String publisher) {
		this.publisher_request = publisher;
	}
	public int getPegi_age() {
		return pegi_age_request;
	}
	public void setPegi_age(int pegi_age) {
		this.pegi_age_request = pegi_age;
	}
	public String getCategory() {
		return category_request;
	}
	public void setCategory(String category) {
		this.category_request = category;
	}
	public String getImage() {
		return image_request;
	}
	public void setImage(String image) {
		this.image_request = image;
	}
	public String getDescription() {
		return description_request;
	}
	public void setDescription(String description) {
		this.description_request = description;
	}
	
	
	
	
}