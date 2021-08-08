package bai_13_thuat_toan_tim_kiem.thuc_hanh.tim_kiem_nhi_phan_khong_dung_de_quy;

public class Binary {
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
