package Lab6;
import Lab5_1.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {
    MovablePoint centerRectangle;

    public MovableRectangle(String border_color, boolean filled_color, double length, double width, double y, double x) {
        super(border_color, filled_color, length, width);
        this.centerRectangle = new MovablePoint(x,y);
    }

    public void setCenterRectangleX(double x){
        this.centerRectangle.setPointX(x);
    }

    public double getCenterRectangleX(){
        return centerRectangle.getPointX();
    }

    public void setCenterRectangleY(double Y){
        this.centerRectangle.setPointY(Y);
    }

    public double getCenterRectangleY(){
        return centerRectangle.getPointY();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "centerRectangle=" + centerRectangle +
                '}';
    }

    @Override
    public void move(double x, double y) {
        centerRectangle.move(x, y);
    }
}