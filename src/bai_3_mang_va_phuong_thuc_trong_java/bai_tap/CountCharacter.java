package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = new String("abcedhashjashafhaskhjhkas");
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        System.out.print("Nhap ky tu muon tim: ");
        char kyTu = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == kyTu) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Ky tu " + kyTu + " ban can tim xuat hien " + count + " lan.");
        } else {
            System.out.println("Ky tu " + kyTu + " ban can tim khong xuat hien trong chuoi.");
        }

    }

}
