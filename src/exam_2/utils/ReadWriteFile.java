package exam_2.utils;

import furamaResort.models.Facility;

import java.io.*;
import java.util.List;
import java.util.Map;

public class ReadWriteFile {

    public static void writeFile(List list, String address) {
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

            objectOutputStream.writeObject(list);

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
        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
//public static void writeFileMap(Map<Facility, Integer> map, String address) {
//    File file = new File(address);
//
//    if (!file.exists()) {
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    try {
//        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(map);
//
//        fileOutputStream.close();
//        objectOutputStream.close();
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
//
//    public static Object readFileMap(String address) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream(address);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            Object object = objectInputStream.readObject();
//            return object;
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

}
