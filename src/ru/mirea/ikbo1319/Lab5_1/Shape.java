package Lab5_1;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled ){
        this.color = color;
        this.filled = filled;
    };

    public Shape() { }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimetr();
}