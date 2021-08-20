package bai_16_text_file.thuc_hanh.tong_cac_so_trong_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader((new FileReader(file)));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum = " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: "); //Duong dan file: src/bai_16_text_file/thuc_hanh/tong_cac_so_trong_file_text/File
        Scanner input = new Scanner(System.in);
        String path=input.nextLine();

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
