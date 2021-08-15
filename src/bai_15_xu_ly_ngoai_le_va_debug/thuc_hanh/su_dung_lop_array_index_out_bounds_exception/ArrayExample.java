package bai_15_xu_ly_ngoai_le_va_debug.thuc_hanh.su_dung_lop_array_index_out_bounds_exception;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] array=new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
            System.out.print(array[i]+"\t");
        }
        return array;
    }
}
