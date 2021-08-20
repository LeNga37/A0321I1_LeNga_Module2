package bai_17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class InputFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("src/bai_17_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/productManage");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            List<Products> productsList=(List<Products>)objectInputStream.readObject();
            for(Products products:productsList){
                System.out.println(products);
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
