package ru.mirea.ikbo1319.Lab17;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

    private int x;
    final int YPOS = 550, WIDTH = 100, HEIGHT = 20, SPEED = 10;
    private Ball ball;

    public Paddle(Ball b) {
        x = (800 - WIDTH) / 2;
        ball = b;
    }

    public void move(int mouseX) {
        mouseX = mouseX - 50;
        int diff = Math.abs(x - mouseX);
        if (mouseX > this.x) { // идем направо
            if (diff < 5)
                x = mouseX;
            else
                x += SPEED;
        } else if (mouseX < this.x) { // идем налево
            if (diff < 5)
                x = mouseX;
            else
                x -= SPEED;
        }
        checkOutsideBounds();
    }

    /**
     * Вызывается во время каждой итерации метода run (). Определяет, столкнулся ли мяч с
     * платформой. При столкновении изменяется х-скорость шара.
     */
    public void checkBallCollision() {
        int ballX = ball.getX() + 10;
        if (ball.getY() >= 530 && ball.getY() <= 534) {
            if (ballX > this.x && ballX < this.x + 100) {
                ball.reverseYVelocity();
                alterXVelocity();
            }
        }
    }

    /**
     * Изменяет x-скорость мяча в зависимости от того, где мяч ударяется о платформу.
     */
    public void alterXVelocity() {
        int ballX = ball.getX() + 10;
        if (ballX >= x && ballX < x + 10)
            ball.setXVel(-6);
        if (ballX >= x + 10 && ballX < x + 20)
            ball.setXVel(-4);
        if (ballX >= x + 20 && ballX < x + 30)
            ball.setXVel(-3);
        if (ballX >= x + 30 && ballX < x + 40)
            ball.setXVel(-2);
        if (ballX >= x + 40 && ballX < x + 60)
            ball.setXVel(0);
        if (ballX >= x + 60 && ballX < x + 70)
            ball.setXVel(2);
        if (ballX >= x + 60 && ballX < x + 80)
            ball.setXVel(3);
        if (ballX >= x + 80 && ballX < x + 90)
            ball.setXVel(4);
        if (ballX >= x + 90 && ballX < x + 100)
            ball.setXVel(6);

        System.out.println("Произошло столкновение");
        System.out.println("Ball xVel = " + ball.getXVel());
    }

    private void checkOutsideBounds() {
        if (x < 0)
            x = 0;
        if (x > 700)
            x = 700;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, YPOS, WIDTH, HEIGHT);
    }
}
