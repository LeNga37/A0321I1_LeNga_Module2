package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class FindMaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat cua mang 2 chieu la: " + max);
    }

}
