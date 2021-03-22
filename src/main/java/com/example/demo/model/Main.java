package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private int size;
    private double price;

    public Main() {
    }

    public Main(String brand, String model, int size, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) { this.size = size; }

    public void setPrice(double price) {
        this.price = price;
    }

}
