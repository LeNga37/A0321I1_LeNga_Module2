package bai_17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_file_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFile {
    public static void writeBinaryFile(Product product){
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("src/bai_17_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_file_binary/product"));
            List<Product> productList=new ArrayList<>();
            productList.add(product);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readBinaryFile() {
        List<Product> productList =new ArrayList<>();
        try{
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("src/bai_17_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_file_binary/product"));
            productList = (List<Product>)objectInputStream.readObject();
//            for(Product product:productList){
//                System.out.println(product);
//            }
            objectInputStream.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
