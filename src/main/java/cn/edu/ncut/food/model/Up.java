package cn.edu.ncut.food.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the up database table.
 * @author Lin
 */
@Entity
@Table(name = "up")
public class Up implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer upid;

	private String platform;

	private String upname;

	private String url;

	@ManyToOne
	@JoinColumn(name="restaurantid")
	private Restaurant restaurant;

	public Up() {
	}

	public Integer getUpid() {
		return this.upid;
	}

	public void setUpid(Integer upid) {
		this.upid = upid;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getUpname() {
		return this.upname;
	}

	public void setUpname(String upname) {
		this.upname = upname;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}