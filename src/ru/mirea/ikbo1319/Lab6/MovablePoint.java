package Lab6;

public class MovablePoint implements Movable {
    private double pointX;
    private double pointY;

    public MovablePoint(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    @Override
    public void move(double x, double y) {
        pointX += x;
        pointY += y;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
