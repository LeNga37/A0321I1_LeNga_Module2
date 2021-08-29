package furamaResort.utils;

import java.util.Scanner;

public class CheckIntNumber {
    public static Integer checkInputIntNumber(){
        Scanner input = new Scanner(System.in);
        try {
            return Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Please enter number");
            return checkInputIntNumber();
        }
    }
}
