package furamaResort.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(Collection collection, String address) {
        File file = new File(address);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file,false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(collection);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFile(String address) {
        try {
            FileInputStream fileInputStream = new FileInputStream(address);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            return object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static void writeFile(Collection collection, String address) {
//        try {
//            FileWriter fileWriter = new FileWriter(address);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(String.valueOf(collection));
//            bufferedWriter.newLine();
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<String[]> readFile(String address) {
//        List<String[]> list = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(address);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
//                String[] elementLine = line.split(",");
////                Object object=new Object()
//                list.add(elementLine);
//            }
//            fileReader.close();
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
}
