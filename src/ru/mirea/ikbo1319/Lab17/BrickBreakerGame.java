package ru.mirea.ikbo1319.Lab17;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BrickBreakerGame extends JFrame {

    private BrickBreakerPanel panel;

    public BrickBreakerGame() {
        panel = new BrickBreakerPanel();
        this.setResizable(false);
        this.setTitle("Brick Breaker");
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack(); // создает размер на основе компонентов
    }

    public static void main(String[] args) {
        BrickBreakerGame game = new BrickBreakerGame();
    }

}
