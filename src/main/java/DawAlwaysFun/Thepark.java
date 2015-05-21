package DawAlwaysFun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Thepark{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name_park;
	private String description_park;
	private String address_park;
	private String province_park;
	private String open_park;
	private String close_park;
	private long price_park;
	private boolean check_park;
	private String image_park;
	private String kind_park;
	private String class_type;
	private int recomendado;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	public String getImage_park() {
		return image_park;
	}
	public void setImage_park(String image) {
		this.image_park = image;
	}
	public String getName_park() {
		return name_park;
	}
	public void setName_park(String name) {
		this.name_park = name;
	}
	public String getDescription_park() {
		return description_park;
	}
	public void setDescription_park(String description) {
		this.description_park = description;
	}
	public String getAddress_park() {
		return address_park;
	}
	public void setAddress_park(String address) {
		this.address_park = address;
	}
	public String getProvince_park() {
		return province_park;
	}
	public void setProvince_park(String province) {
		this.province_park = province;
	}
	public String getOpen_park() {
		return open_park;
	}
	public void setOpen_park(String open_time) {
		this.open_park = open_time;
	}
	public String getClose_park() {
		return close_park;
	}
	public void setClose_park(String close_time) {
		this.close_park = close_time;
	}
	public long getPrice_park() {
		return price_park;
	}
	public void setPrice_park(long price) {
		this.price_park = price;
	}
	public boolean isCheck_park() {
		return check_park;
	}
	public void setCheck_park(boolean check) {
		this.check_park = check;
	}
	public String getKind_park() {
		return kind_park;
	}
	public void setKind_park(String kind) {
		this.kind_park = kind;
	}
	public int getRecomendado() {
		return recomendado;
	}
	public void setRecomendado(int recomendado) {
		this.recomendado = recomendado;
	}
	
}
