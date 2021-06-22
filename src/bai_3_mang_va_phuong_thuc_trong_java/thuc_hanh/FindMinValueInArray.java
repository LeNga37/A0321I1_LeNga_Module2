package bai_3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class FindMinValueInArray {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {26, 36, 35, 24, 76, 21, 68, 46, 73};
        int min = minValue(array);
        System.out.println(" Gia tri nho nhat la: " + min);
    }
}

