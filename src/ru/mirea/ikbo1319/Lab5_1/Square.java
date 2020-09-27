package Lab5_1;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square() { }

    public Square(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
