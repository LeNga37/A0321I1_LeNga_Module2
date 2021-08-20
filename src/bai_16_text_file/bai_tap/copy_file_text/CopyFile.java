package bai_16_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/bai_16_text_file/bai_tap/copy_file_text/copyfile");
            FileWriter fileWriter = new FileWriter("src/bai_16_text_file/bai_tap/copy_file_text/pastefile");

            int line;
            int count = 0;
            while ((line = fileReader.read()) != -1) {
                fileWriter.write((char) line);
                count++; //Khi xuống dòng có tính là ký tự không
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("So ky tu la: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
