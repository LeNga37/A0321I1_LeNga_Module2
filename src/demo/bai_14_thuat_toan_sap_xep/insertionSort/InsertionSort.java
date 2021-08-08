package demo.bai_14_thuat_toan_sap_xep.insertionSort;

public class InsertionSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

