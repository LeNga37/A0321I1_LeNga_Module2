package bai_14_thuat_toan_sap_xep.thuc_hanh.thuat_toan_sap_xep_chon;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        for(int i=0;i<list.length-1;i++){
            /* Find the minimum in the list[i..list.length-1] */
            int min_index=i;
            for(int j=i+1;j<list.length;j++){
                if(list[min_index]>list[j]){
                    min_index=j;
                }
            }
            /* Swap list[i] with list[currentMinIndex] if necessary */
            if(min_index!=i){
                double temp=list[min_index];
                list[min_index]=list[i];
                list[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
