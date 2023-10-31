package com.mustafabaser.javabootcamp.collections;

public class Products {
    private int id;
    private String name;
    private int price;
    private int quantity;

    // Constructor
    public Products(int id, String name, int price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = amount;
    }

    // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
