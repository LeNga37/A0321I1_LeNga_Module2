package bai_17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import sun.awt.Symbol;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products implements Serializable {
    private int productId;
    private String productName;
    private String manufacturer;
    private double price;
    private String description;

    public Products() {

    }

    public Products(int productId, String productName, String manufacturer, double price, String description) {
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

    public static void addProduct(){
        Scanner input =new Scanner(System.in);
        
    }


    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/bai_17_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/productManage");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            List<Products> productList = new ArrayList<>();
            Products product1 = new Products(1, "iphone5", "USA", 2500000, "old");
            Products product2 = new Products(2, "iphone6", "USA", 5500000, "new");
            Products product3 = new Products(3, "iphone10", "USA", 10000000, "new");
            productList.add(product1);
            productList.add(product2);
            productList.add(product3);

            objectOutputStream.writeObject(productList);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
