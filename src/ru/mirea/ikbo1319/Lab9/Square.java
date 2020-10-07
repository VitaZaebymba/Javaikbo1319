package Lab9;

import java.awt.*;

public class Square extends Shape {
    public Square(int x, int y, Color color) {
        super(x, y, color);

    }


    public void paint(Graphics g) {
        g.setColor(getColor());

        g.fillRect(50, 50, 250, 200);

    }
}