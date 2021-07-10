package bai_6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import com.sun.javaws.security.AppContextUtil;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {super.getX(), super.getY(), this.z};
        return arr;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public String toString() {
        return "Point3D = {"
                + "x = " + super.getX()
                + " y = " + super.getY()
                + " z = " + getZ()
                + "}";
    }
}
