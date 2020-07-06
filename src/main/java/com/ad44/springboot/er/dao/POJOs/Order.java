package com.ad44.springboot.er.dao.POJOs;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String camera;
    String town;
    String description;

    public Order() {
    }

    public Order(String camera, String town, String description) {
        this.camera = camera;
        this.town = town;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", camera='" + camera + '\'' +
                ", town='" + town + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
