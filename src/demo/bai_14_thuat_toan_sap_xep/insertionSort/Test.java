package demo.bai_14_thuat_toan_sap_xep.insertionSort;

public class Test {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Mang ban dau: ");
        InsertionSort.printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mang sau khi sap xep: ");
        InsertionSort.printArray(arr);
    }
}
