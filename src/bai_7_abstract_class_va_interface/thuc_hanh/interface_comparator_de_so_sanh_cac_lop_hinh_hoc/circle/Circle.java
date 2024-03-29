package bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.circle;

import bai_7_abstract_class_va_interface.thuc_hanh.interface_comparator_de_so_sanh_cac_lop_hinh_hoc.shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
