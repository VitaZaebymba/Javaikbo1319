package ru.mirea.ikbo1319.Lab17;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class BrickBreakerPanel extends JPanel implements MouseListener, MouseMotionListener, Runnable {

    private boolean insidePanel, gameOver, gameWon;
    private Paddle paddle;
    private int mouseX;
    Thread thread;
    private Ball ball;
    private List<Brick> bricks;
    private long startTime, stopTime;

    public BrickBreakerPanel() {
        super(null, true);
        this.setPreferredSize(new Dimension(800, 600)); // позволяет JFrame пользоваться
        // size
        System.out.println("Width: " + this.getWidth());
        System.out.println("Height: " + this.getHeight());
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        insidePanel = false;
        gameOver = false;
        gameWon = false;
        ball = new Ball();
        paddle = new Paddle(ball);
        mouseX = 0;
        this.createBricks();
        thread = new Thread(this);
        thread.start();
    }

    public void createBricks() {
        bricks = new ArrayList<Brick>();
        double temp = 40;
        for (int i = 0; i < 4; i++) { // было 12
            bricks.add(new Brick(ball, (int) temp));
            temp += Brick.WIDTH + 40;
        }
    }

    public void paintComponent(Graphics g) {
        // background
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);

        if (!gameOver) {
            // рисуем объекты
            paddle.draw(g);
            ball.draw(g);
            for (Brick b : bricks) {
                b.draw(g);
            }
        } else if (gameOver && !gameWon) {
            g.setColor(Color.red);
            g.setFont(new Font("TimesRoman", Font.BOLD, 28));
            g.drawString("GAME OVER", 330, 300);
        } else {
            g.setColor(Color.red);
            double time = Math.round(stopTime - startTime) / 1000.0;
            g.setFont(new Font("TimesRoman", Font.BOLD, 28));
            g.drawString("Игра завершена за " + time + " seconds.", 170, 300);
        }

    }

    public void run() {
        while (true) {
            paddle.move(mouseX);
            ball.move();
            paddle.checkBallCollision();
            for (int i = 0; i < bricks.size(); i++) {
                if (bricks.get(i).checkBallCollision()) {
                    bricks.remove(i);
                    i--;
                }
            }
            checkGameOver();
            repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkGameOver() {
        if (!gameOver) {
            if (ball.getY() > 600) {
                gameOver = true;
                ball.setXVel(0);
                ball.setYVel(0);
                stopTime = System.currentTimeMillis();
            }
            if (bricks.isEmpty()) {
                stopTime = System.currentTimeMillis();
                gameWon = true;
                gameOver = true;
            }
        }

    }

    public void mouseClicked(MouseEvent mouse) {
        if (!ball.isMoving()) {
            ball.startMoving();
            startTime = System.currentTimeMillis();
        }
        if (gameOver) {
            ball = new Ball();
            paddle = new Paddle(ball);
            createBricks();
            gameOver = false;
            gameWon = false;
        }
    }

    public void mouseEntered(MouseEvent mouse) {

    }

    public void mouseExited(MouseEvent arg0) {
        insidePanel = false;
    }

    public void mousePressed(MouseEvent arg0) {

    }

    public void mouseReleased(MouseEvent arg0) {

    }

    public void mouseDragged(MouseEvent arg0) {

    }

    public void mouseMoved(MouseEvent mouse) {
        mouseX = mouse.getX();
    }

}
