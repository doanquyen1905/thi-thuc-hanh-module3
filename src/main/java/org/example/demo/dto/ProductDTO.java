package org.example.demo.dto;

public class ProductDTO {
    private String name;
    private Double price;
    private int discount;
    private int stock;
    public ProductDTO(){

    }
    public ProductDTO(String name,double price,int discount,int stock){
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
