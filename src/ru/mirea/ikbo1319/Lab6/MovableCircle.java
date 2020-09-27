package Lab6;
import Lab5_1.Circle;


public class MovableCircle extends Circle implements Movable {

    MovablePoint circleCenter;

    public MovableCircle(String border_color, boolean filled_color, double radius, double x, double y) {
        super(border_color, filled_color, radius);
        this.circleCenter = new MovablePoint(x,y);
    }

    public void setCenterX(double x){
        this.circleCenter.setPointX(x);
    }

    public double getCenterX(){
        return circleCenter.getPointX();
    }

    public void setCenterY(double y){
        this.circleCenter.setPointY(y);
    }

    public double getCenterY(){
        return circleCenter.getPointY();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "circleCenter=" + circleCenter +
                '}';
    }

    @Override
    public void move(double x, double y) {
        circleCenter.move(x,y);
    }
}
