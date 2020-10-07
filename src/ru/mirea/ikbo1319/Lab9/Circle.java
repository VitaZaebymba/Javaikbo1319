package Lab9;

import java.awt.*;

public class Circle extends Shape {


    public Circle(int x, int y, Color color) {
        super(x, y, color);

    }


    public void paint(Graphics g) {

        g.setColor(getColor());

        g.fillOval(50, 50, 250, 250);

    }
}