package bai_17_binary_file_va_serialization.thuc_hanh.copy_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException{
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream is=null;
        OutputStream os=null;
        try {
            is =new FileInputStream(source);
            os = new FileOutputStream(source);
            byte[] buffer=new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter source file: ");
        //D:\\Tài liệu module 2\\Bài 17 IO Binary File & Serialization\\Binary File.rar
        String sourcePath=input.nextLine();

        System.out.println("Enter dest file: ");
        //D:\\Tài liệu module 2\\Bài 17 IO Binary File & Serialization\\Test.rar
        String destPath =input.nextLine();

        File sourceFile=new File(sourcePath);
        File destFile=new File(destPath);

        try{
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.println("Copy completed");
        } catch (IOException e) {
            System.out.printf("Can't copy that file");
            System.out.printf(e.getMessage());        }


    }
}
