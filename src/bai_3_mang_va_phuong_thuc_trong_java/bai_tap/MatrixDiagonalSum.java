package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static float SumDiagonal(float[][] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    //    public static void main(String[] args) {
//        float[][] arr=new float[3][3];
//        arr[0][0]=1.1f;
//        arr[0][1]=1.2f;
//        arr[0][2]=1.3f;
//        arr[1][0]=1.4f;
//        arr[1][1]=1.5f;
//        arr[1][2]=1.6f;
//        arr[2][0]=1.7f;
//        arr[2][1]=1.8f;
//        arr[2][2]=1.9f;
//        float sum=SumDiagonal(arr);
//        System.out.println(sum);
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hang, cot cua ma tran vuong: ");
        int num = input.nextInt();
        float[][] matrix = new float[num][num];
        System.out.println("Nhap " + matrix.length + " hang va " +
                matrix[0].length + " cot: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextFloat();
            }
        }
        System.out.println("Ma tran da nhap la: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Tong cac so o duong cheo chinh la: ");
        float sum = SumDiagonal(matrix);
        System.out.println(sum);
    }
}
