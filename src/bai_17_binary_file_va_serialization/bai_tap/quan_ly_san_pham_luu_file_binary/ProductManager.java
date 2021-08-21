package bai_17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_file_binary;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner input =new Scanner(System.in);

    public void displayMenu()  {
        int choice;
            System.out.println("Please enter choice \n"
                    + "1. Display product list \n"
                    + "2. Add new product \n"
                    + "3. Search product \n"
                    + "4. Return main menu \n"
                    +"5. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayProductList();
                    displayMenu();
                    break;
                case 2:
                    addProduct();
                    displayMenu();
                    break;
                case 3:
//                        searchProuct();
                    break;
                case 4:
                    displayMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please input 1 ~ 5");
                    displayMenu();
            }
    }
    public void addProduct(){
        Product product=new Product();
        System.out.println("Enter ProductId:");
        product.setProductId(input.nextInt());
        input.skip("\\R");

        System.out.println("Enter ProductName:");
        product.setProductName(input.nextLine());

        System.out.println("Enter manufacturer:");
        product.setManufacturer(input.nextLine());

        System.out.println("Enter price:");
        product.setPrice(input.nextInt());
        input.skip("\\R");

        System.out.println("Enter description:");
        product.setDescription(input.nextLine());
        BinaryFile.writeBinaryFile(product);
    }

    public void displayProductList() {
        List<Product> productsList= BinaryFile.readBinaryFile();
        System.out.println();
        for(Product product:productsList){
            System.out.println(product);
        }
    }
}
