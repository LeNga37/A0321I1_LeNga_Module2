package bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.comparale_circle;

import bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
