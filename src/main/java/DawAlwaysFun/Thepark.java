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
	
	public String getImage() {
		return image_park;
	}
	public void setImage(String image) {
		this.image_park = image;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name_park;
	}
	public void setName(String name) {
		this.name_park = name;
	}
	public String getDescription() {
		return description_park;
	}
	public void setDescription(String description) {
		this.description_park = description;
	}
	public String getAddress() {
		return address_park;
	}
	public void setAddress(String address) {
		this.address_park = address;
	}
	public String getProvince() {
		return province_park;
	}
	public void setProvince(String province) {
		this.province_park = province;
	}
	public String getOpen_time() {
		return open_park;
	}
	public void setOpen_time(String open_time) {
		this.open_park = open_time;
	}
	public String getClose_time() {
		return close_park;
	}
	public void setClose_time(String close_time) {
		this.close_park = close_time;
	}
	public long getPrice() {
		return price_park;
	}
	public void setPrice(long price) {
		this.price_park = price;
	}
	public boolean isCheck() {
		return check_park;
	}
	public void setCheck(boolean check) {
		this.check_park = check;
	}
	public String getKind() {
		return kind_park;
	}
	public void setKind(String kind) {
		this.kind_park = kind;
	}
	
}
