package bai_15_xu_ly_ngoai_le_va_debug.thuc_hanh.su_dung_lop_number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hay nhap x: ");
        int x=input.nextInt();
        System.out.println("Hay nhap y: ");
        int y=input.nextInt();
        CalculationExample calculationExample=new CalculationExample();
        calculationExample.calculate(x,y);
    }
    private void calculate(int x,int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
