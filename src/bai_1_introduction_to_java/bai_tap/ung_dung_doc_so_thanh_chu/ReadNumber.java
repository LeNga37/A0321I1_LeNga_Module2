package bai_1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class ReadNumber {
    final static String[] ONES = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    final static String[] TENS = {" ", " ", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void readNumber(int num, String value) {
        System.out.println(num > 19 ? TENS[num / 10] + " " + ONES[num % 10] : ONES[num]);
        System.out.println(num > 0 ? value : "");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        readNumber(((num / 100) % 10), "Hundred and");
        readNumber(num % 100, "");
    }

}
