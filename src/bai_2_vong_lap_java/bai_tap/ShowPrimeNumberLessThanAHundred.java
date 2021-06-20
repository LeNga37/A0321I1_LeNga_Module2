package bai_2_vong_lap_java.bai_tap;

public class ShowPrimeNumberLessThanAHundred {
    public static void main(String[] args) {
        int num=0;
        int counter = 1;
        for (int i = 1; i <= 100; i++) {
           counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }
    }
}
