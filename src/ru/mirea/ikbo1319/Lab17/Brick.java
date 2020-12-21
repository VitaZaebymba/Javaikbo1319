package ru.mirea.ikbo1319.Lab17;

import java.awt.Color;
import java.awt.Graphics;

public class Brick {
    public final static int WIDTH = 150;
    final int Y = 5;
    private Ball ball;
    private int x;

    public Brick(Ball b, int x) {
        ball = b;
        this.x = x;
    }

    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, Y, WIDTH, 10);
    }

    public boolean checkBallCollision() {
        int ballX = ball.getX() + 10;
        if (ball.getY() <= 15 && ball.getY() >= 5) {
            if (ballX >= x && ballX <= x + WIDTH) {
                ball.reverseYVelocity();
                return true;
            }
        }
        return false;
    }
}
