package furamaResort.utils;

import furamaResort.models.Facility;

import java.io.*;
import java.util.*;

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
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(collection);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFile(String address) {
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

    public static void writeFileMap(Map<Facility, Integer> map, String address) {
        File file = new File(address);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(map);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFileMap(String address) {
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

    //IO text file
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

    //List
//    public static void writeFileList(List list, String address) {
//        File file = new File(address);
//
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file,false);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//            objectOutputStream.writeObject(list);
//
//            fileOutputStream.close();
//            objectOutputStream.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Object readFileList(String address) {
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
