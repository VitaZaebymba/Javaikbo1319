package Lab3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(12);
        System.out.println(circle.getR());
        System.out.println(circle.getL());
        System.out.println(circle.getS());
        circle.setL(2);
        circle.setR(1);
        circle.setS(3);
        System.out.println(circle.getR());
        System.out.println(circle.getL());
        System.out.println(circle.getS());
    }
}
