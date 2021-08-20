package bai_16_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class ReaderFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/bai_16_text_file/bai_tap/doc_file_csv/country");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] array;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                System.out.println(array[3]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
