package DawAlwaysFun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private int star;
	private long price_medium;
	private String address_local;
	private String descripcion;
	private String province;
	private String photo;
	private String open_time;
	private String close_time;
	private int capacity;
	private String local_type;
	private String class_type;
	private int recomendado;
	
	
	
	public int getRecomendado() {
		return recomendado;
	}
	public void setRecomendado(int recomendado) {
		this.recomendado = recomendado;
	}
	public String getLocal_type() {
		return local_type;
	}
	public void setLocal_type(String local_type) {
		this.local_type = local_type;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public long getPrice_medium() {
		return price_medium;
	}
	public void setPrice_medium(long price_medium) {
		this.price_medium = price_medium;
	}
	public String getAddress_local() {
		return address_local;
	}
	public void setAddress_local(String address_local) {
		this.address_local = address_local;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String provice) {
		this.province = provice;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}