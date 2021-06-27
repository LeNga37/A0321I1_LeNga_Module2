package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class SumOneColumn {
    public static float sumColumn(float[][] array) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap cot ban muon tinh tong: ");
        int column = input.nextInt();
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column - 1];
        }
        return sum;
    }

//    public static void main(String[] args) {
//        float [][]array=new float[3][3];
//        array[0][0]=1.2f;
//        array[0][1]=1.3f;
//        array[0][2]=1.4f;
//        array[1][0]=1.5f;
//        array[1][1]=1.6f;
//        array[1][2]=1.7f;
//        array[2][0]=1.8f;
//        array[2][1]=1.9f;
//        array[2][2]=1.45f;
//        float sum=sumColumn(array);
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang 2 chieu: ");
        int row = input.nextInt();
        System.out.print("Nhap so cot cua mang 2 chieu: ");
        int col = input.nextInt();
        float[][] matrix = new float[row][col];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextFloat();
            }
        }
        System.out.println("Mang 2 chieu da nhap la: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.print("Tong cua cot ban muon tinh tong la: ");
        float sum = sumColumn(matrix);
        System.out.println(sum);

    }
}
