package bai_1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class ChanceMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Enter your USD: ");
        float usd = scanner.nextFloat();
        System.out.println(usd+" USD = "+usd*rate+" VND");
    }
}
