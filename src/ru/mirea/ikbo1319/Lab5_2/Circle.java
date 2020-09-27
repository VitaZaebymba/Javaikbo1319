package Lab5_2;

public class Circle extends Shape {
    private double radius;

    public Circle(String border_color, boolean filled_color, double radius) {
        super(border_color, filled_color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }
}
