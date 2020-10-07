package Lab9;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    private Color color;
    private int x;
    private  int y;
    public Shape(int x ,int y,Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public abstract void paint(Graphics g);
}
