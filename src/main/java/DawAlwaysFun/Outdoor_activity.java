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

	private String address;
	private String risk;

	private long price;
	private String image_activity;
	private int duration;
	private String province;
	private String class_type;
	private int recomendado;
	
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRisk() {
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
	public String getImage_activity() {
		return image_activity;
	}
	public void setImage_activity(String image) {
		this.image_activity = image;
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
	public int getRecomendado() {
		return recomendado;
	}
	public void setRecomendado(int recomendado) {
		this.recomendado = recomendado;
	}
	
}
