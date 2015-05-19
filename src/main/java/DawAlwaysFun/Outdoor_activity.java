package DawAlwaysFun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Outdoor_activity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String description;
	private String name;
	private int age_recomended;
<<<<<<< HEAD
	private String adress;
	private boolean risk;
=======
	private String site;
	private String risk;
>>>>>>> origin/master
	private long price;
	private String image;
	private int duration;
	private String province;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge_recomended() {
		return age_recomended;
	}
	public void setAge_recomended(int age_recomended) {
		this.age_recomended = age_recomended;
	}
	public String getAdress() {
		return adress;
	}
	public void setSite(String adress) {
		this.adress = adress;
	}
	public String isRisk() {
		return risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	
}
