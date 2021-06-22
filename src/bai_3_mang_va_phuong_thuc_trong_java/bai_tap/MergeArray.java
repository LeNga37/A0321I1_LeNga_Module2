package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size;
        int[] array1;
        int[] array2;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong phan tu cua mang1, 2:");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("Nhap so luong phan tu nho hon 10");
            }
        } while (size > 10);

        array1 = new int[size];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Nhap gia tri cua phan tu thu " + (i + 1) + " cua mang 1: ");
            array1[i] = input.nextInt();
            i++;
        }
        System.out.print("Mang 1 da nhap: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.print("\n");
        array2 = new int[size];
        int k = 0;
        while (k < array1.length) {
            System.out.print("Nhap gia tri cua phan tu thu " + (k + 1) + " cua mang 2: ");
            array2[k] = input.nextInt();
            k++;
        }

        System.out.print("Mang 2 da nhap: ");
        for (int l = 0; l < array2.length; l++) {
            System.out.print(array2[l] + "\t");
        }
        System.out.print("\n"+"Mang sau khi gop la: ");
        int[] newArray=new int[array1.length+array2.length];
        for(int m=0;m<array1.length;m++){
            newArray[m]=array1[m];
        }
        for(int n=array1.length;n<newArray.length;n++){
            newArray[n]=array2[n-array1.length];
        }
        for(int h:newArray){
            System.out.print(h+"\t");
        }
    }
}
