package bai_6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class TestMainPoint2D3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.7f, 4.7f);
        System.out.println(point2D);

        Point2D point2D1 = new Point3D();
        System.out.println(point2D1);
        point2D1 = new Point3D(3.7f, 4.7f, 5.7f);
        System.out.println(point2D1);

    }
}
