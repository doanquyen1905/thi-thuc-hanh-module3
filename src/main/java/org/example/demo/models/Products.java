package org.example.demo.models;

public class Products {
    private int id_product;
    private String name_product;
    private double price_product;
    private double discount;
    private int stock;
    public Products(){

    }
    public Products(int id_product,String name_product,double price_product,double discount,int stock){
        this.id_product = id_product;
        this.name_product = name_product;
        this.price_product =price_product;
        this.discount = discount;
        this.stock = stock;
    }
    public Products(String name_product,double price_product, double discount,int stock){
        this.name_product = name_product;
        this.price_product =price_product;
        this.discount = discount;
        this.stock = stock;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(double price_product) {
        this.price_product = price_product;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
