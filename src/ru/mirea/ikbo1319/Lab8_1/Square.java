package Lab8_1;

import java.awt.*;

public class Square extends Shape {
    public Square(int x, int y, Color color) {
        super(x, y, color);

    }


    public void paint(Graphics g) {
        g.setColor(getColor());

        g.fillRect(getX(), getY(), 50, 50);

    }
}