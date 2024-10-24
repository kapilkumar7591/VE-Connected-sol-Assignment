package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity;
import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Productid;

    @Column(name="name")
    private String ProductName;

    @Column(name="brand")
    private String ProductBrand;

    @Column(name="category")
    private String ProductCategory;


    // define constructors

    public Product() {

    }

    public Product(String productName, String productBrand, String productCategory) {
        ProductName = productName;
        ProductBrand = productBrand;
        ProductCategory = productCategory;
    }
// define getter/setter


    public int getProductid() {
        return Productid;
    }

    public void setProductid(int productid) {
        Productid = productid;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setProductBrand(String productBrand) {
        ProductBrand = productBrand;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    // define toString

    @Override
    public String toString() {
        return "Product{" +
                "Productid=" + Productid +
                ", ProductName='" + ProductName + '\'' +
                ", ProductBrand='" + ProductBrand + '\'' +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}