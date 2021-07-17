package bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
