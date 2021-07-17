package bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.circle;

import bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.shape.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Shape shape=new Circle();
        System.out.println(shape);

        shape =new Circle(3.5);
        System.out.println(shape);

        shape= new Circle(3.5, "indigo", false);
        System.out.println(shape);

    }
}
