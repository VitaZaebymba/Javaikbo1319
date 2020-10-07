package Lab8_1;

import java.awt.*;

public class Circle extends Shape {


    public Circle(int x, int y, Color color) {
        super(x, y, color);

    }


    public void paint(Graphics g) {
        g.setColor(getColor());

        g.fillOval(getX(), getY(), 50, 50);

    }
}