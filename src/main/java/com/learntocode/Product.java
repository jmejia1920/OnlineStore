package com.learntocode;

public class Product {
    private Integer Id;
    private String Name;
    private double Price;

    public Product(int id, String name, double price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
