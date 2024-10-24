package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity;
import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="Name")
    private String CustomerName;

    @Column(name="Product")
    private String productName;

    @Column(name="Status")
    private String Productstatus;


    // define constructors


    public Order() {
    }

    public Order(String customerName, String productName, String productstatus) {
        CustomerName = customerName;
        this.productName = productName;
        Productstatus = productstatus;
    }



    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductstatus() {
        return Productstatus;
    }

    public void setProductstatus(String productstatus) {
        Productstatus = productstatus;
    }


    // define toString


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", CustomerName='" + CustomerName + '\'' +
                ", productName='" + productName + '\'' +
                ", Productstatus='" + Productstatus + '\'' +
                '}';
    }
}

