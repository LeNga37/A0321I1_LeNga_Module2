package bai_17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_file_binary;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String manufacturer;
    private double price;
    private String description;

    public Product() {

    }

    public Product(int productId, String productName, String manufacturer, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return productId + "," + productName + "," + manufacturer + "," + price + "," + description;
    }
}