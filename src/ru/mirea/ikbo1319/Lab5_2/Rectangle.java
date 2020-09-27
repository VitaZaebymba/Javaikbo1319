package Lab5_2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String border_color, boolean filled_color, double length, double width) {
        super(border_color, filled_color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimetr() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
