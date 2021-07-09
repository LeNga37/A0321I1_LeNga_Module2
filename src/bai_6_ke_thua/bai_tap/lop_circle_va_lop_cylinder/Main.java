package bai_6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle=new Circle(4.7,"yellow");
        System.out.println(circle);

        Circle cylinder=new Cylinder();
        cylinder=new Cylinder(4.7,2.3,"blue");
        System.out.println(cylinder);

    }
}
