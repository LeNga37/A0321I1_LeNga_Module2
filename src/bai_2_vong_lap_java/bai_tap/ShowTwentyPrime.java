package bai_2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class ShowTwentyPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
        int num = 20;
        int count = 0;
        int N = 2;
        boolean check = true;
        while (count < num) {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(N);
            }
            check=true;
            N++;
        }

    }
}
