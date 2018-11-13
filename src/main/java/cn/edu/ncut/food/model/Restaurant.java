package cn.edu.ncut.food.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the restaurant database table.
 *
 * @author Lin
 */
@Entity
@Table(name = "restaurant")
public class Restaurant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer restaurantid;

    private String address;

    private String city;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date edittime;

    private String evaluation;

    private Float latitude;

    private Float longitude;

    @OneToMany(mappedBy = "restaurant")
    private List<Hk> hks;

    @OneToMany(mappedBy = "restaurant")
    private List<Up> ups;

    public Restaurant() {
    }

    public Integer getRestaurantid() {
        return this.restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEdittime() {
        return this.edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getEvaluation() {
        return this.evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public Float getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public List<Hk> getHks() {
        return this.hks;
    }

    public void setHks(List<Hk> hks) {
        this.hks = hks;
    }

    public Hk addHk(Hk hk) {
        getHks().add(hk);
        hk.setRestaurant(this);

        return hk;
    }

    public Hk removeHk(Hk hk) {
        getHks().remove(hk);
        hk.setRestaurant(null);

        return hk;
    }

    public List<Up> getUps() {
        return this.ups;
    }

    public void setUps(List<Up> ups) {
        this.ups = ups;
    }

    public Up addUp(Up up) {
        getUps().add(up);
        up.setRestaurant(this);

        return up;
    }

    public Up removeUp(Up up) {
        getUps().remove(up);
        up.setRestaurant(null);

        return up;
    }

}