package cn.edu.ncut.food.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the hk database table.
 * @author Lin
 */
@Entity
@Table(name = "hk")
public class Hk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer foodid;

	private String foodname;

	private String personalevaluation;

	private float score;

	@ManyToOne
	@JoinColumn(name="restaurantid")
	private Restaurant restaurant;

	public Hk() {
	}

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getPersonalevaluation() {
		return this.personalevaluation;
	}

	public void setPersonalevaluation(String personalevaluation) {
		this.personalevaluation = personalevaluation;
	}

	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public Restaurant getRestaurant() {
		return this.restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}