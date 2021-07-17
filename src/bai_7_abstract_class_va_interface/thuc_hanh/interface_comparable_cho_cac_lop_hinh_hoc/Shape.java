package bai_7_abstract_class_va_interface.thuc_hanh.interface_comparable_cho_cac_lop_hinh_hoc;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return filled ? "A Shape with color of" + getColor() + " and " +
                "filled" : "A Shape with color of" + getColor() + " and " + "not filled";
    }
}

