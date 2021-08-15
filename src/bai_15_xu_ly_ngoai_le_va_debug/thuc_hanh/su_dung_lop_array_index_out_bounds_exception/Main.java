package bai_15_xu_ly_ngoai_le_va_debug.thuc_hanh.su_dung_lop_array_index_out_bounds_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] array=arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("\nNhap chi so cua mot phan tu bat ky: ");
        int index=input.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so "+index+" la: "+array[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot gioi han cua mang.");
        }
    }
}
