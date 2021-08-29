package furamaResort.utils;

import java.util.Scanner;

public class CheckNumber {
    public static Double checkIntInputNumber(){
        Scanner input =new Scanner(System.in);
        try {
            return Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter number");
            return checkIntInputNumber();
        }
    }

}
