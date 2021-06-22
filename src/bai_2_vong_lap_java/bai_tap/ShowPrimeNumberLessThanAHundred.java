package bai_2_vong_lap_java.bai_tap;

public class ShowPrimeNumberLessThanAHundred {
    public static void main(String[] args) {
//        int num=0;
//        int counter = 1;
//        for (int i = 1; i <= 100; i++) {
//           counter = 0;
//            for (num = i; num >= 1; num--) {
//                if (i % num == 0) {
//                    counter += 1;
//                }
//            }
//            if (counter == 2) {
//                System.out.println(i);
//            }
//        }

        System.out.print(2);

        for (int i = 3; i < 100; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

