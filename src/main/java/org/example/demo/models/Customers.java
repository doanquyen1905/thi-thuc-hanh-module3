package org.example.demo.models;

import java.util.Date;

public class Customers {
    private int id_customer;
    private String name_customer;
    private Date dob_customer;
    private String phone_customer;
    private String address_customer;
    private String email_customer;
    public Customers(){

    }
    public Customers(int id_customer,String name_customer,Date dob_customer,String phone_customer,String address_customer,String email_customer){
        this.id_customer = id_customer;
        this.name_customer = name_customer;
        this.dob_customer = dob_customer;
        this.phone_customer = phone_customer;
        this.address_customer = address_customer;
        this.email_customer = email_customer;

    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public Date getDob_customer() {
        return dob_customer;
    }

    public void setDob_customer(Date dob_customer) {
        this.dob_customer = dob_customer;
    }

    public String getPhone_customer() {
        return phone_customer;
    }

    public void setPhone_customer(String phone_customer) {
        this.phone_customer = phone_customer;
    }

    public String getAddress_customer() {
        return address_customer;
    }

    public void setAddress_customer(String address_customer) {
        this.address_customer = address_customer;
    }

    public String getEmail_customer() {
        return email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }
}
