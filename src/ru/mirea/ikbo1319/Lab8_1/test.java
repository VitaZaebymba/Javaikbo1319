package Lab8_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class test extends JFrame {
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private int x = 10;
    private int y = 10;
    private int px = 10;
    private int i = 0;
    private int nextX = 0;
    private int nextY = 0;
    public Shape setTheValue(){
        if(i == 0){
            i++;
        }
        else if (i<=10){
            i++;
            nextX += 60;
        }
        if (i == 11){
            nextX = px;
            nextY +=60;
            i++;
        }
        else if (i>10){
            i++;
            nextX +=60;
        }
        Random random = new Random();
        switch (random.nextInt(3)){
            case 1:
                return new Circle(x+ nextX,y+nextY,color());
            case 2:
                return  new Square(x+ nextX,y+nextY,color());
        }
        return new Circle(x+ nextX,y+nextY,color());
    }
    public Color color(){
        Random random = new Random();

        switch (random.nextInt(5)){
            case 1:
                return Color.BLUE;
            case 2:
                return Color.BLACK;
            case 3:
                return Color.RED;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.YELLOW;

        }
        return Color.MAGENTA;
    }
    public test(){
        super("dasd");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,400,1000 , 1000);
        setVisible(true);
        add( new Mycomponent());
    }

    class Mycomponent extends JComponent{
        public void paint(Graphics g){
            super.paintComponent(g);
            for (int i = 0; i< 20;i++){
                Shape shape = setTheValue();
                shape.paint(g);
            }
            setVisible(true);
        }
    }
}
