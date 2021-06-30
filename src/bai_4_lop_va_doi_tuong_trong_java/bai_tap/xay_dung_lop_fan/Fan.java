package bai_4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed = slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return speed + " " + color + " " + radius + " fan is on";
        } else {
            return speed + " " + color + " " + radius + " fan is off";
        }
    }
}
