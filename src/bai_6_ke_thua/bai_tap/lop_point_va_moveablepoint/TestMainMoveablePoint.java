package bai_6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMainMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2.5f, 3.5f);
        System.out.println(point);

        Point movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(point.getX(), point.getY(), 4.5f, 5.5f);
        System.out.println(movablePoint);

    }
}
