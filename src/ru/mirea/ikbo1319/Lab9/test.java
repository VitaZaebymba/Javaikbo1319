package Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.event.*;
public class test extends JFrame {
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private int x = 10;
    private int y = 10;
    private int px = 10;
    private int i = 0;
    private int nextX = 0;
    private int nextY = 0;

    public Shape setTheValue() {
        if (i == 0) {
            i++;
        } else if (i <= 10) {
            i++;
            nextX += 60;
        }
        if (i == 11) {
            nextX = px;
            nextY += 60;
            i++;
        } else if (i > 10) {
            i++;
            nextX += 60;
        }
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 1:
                return new Circle(x + nextX, y + nextY, color());
            case 2:
                return new Square(x + nextX, y + nextY, color());
        }
        return new Circle(x + nextX, y + nextY, color());
    }

    public Color color() {
        Random random = new Random();

        switch (random.nextInt(5)) {
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


    private JFrame jFrame;
    JPanel[] pnl = new JPanel[2];
    JButton jButton = new JButton("CLICK");
    JButton jButton2 = new JButton("CLICK");
    JPanel jPanel = new JPanel();
    public test() {
//        super("dasd");
        jFrame = new JFrame("Фигура");



        jFrame.setBounds(300, 300, 1000, 1000);
        jFrame.setVisible(true);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton = new JButton("CLICK");
        jFrame.setLayout(new BorderLayout());
        jFrame.add(jButton,BorderLayout.NORTH);
        Container container = getContentPane();
        container.add(new Mycomponent());
        jFrame.add(container,BorderLayout.CENTER);
        jFrame.add(new abc());


    }
    public void b(){
        jFrame.add(jButton2,BorderLayout.CENTER);
    }
    class abc extends JComponent{

        public  abc() {
            jButton.addActionListener(lister);

        }
        ActionListener lister = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                abcc();


            }
        };


    }

    public void swe(){


        jPanel.setBackground(Color.white);
        jFrame.add(jPanel,BorderLayout.CENTER);
        jFrame.setVisible(true);

    }
    public void abcc(){

        jFrame.add(new Mycomponent(),BorderLayout.CENTER);

        jFrame.setVisible(true);
    }
    class Mycomponent extends JComponent {
        public void paint(Graphics g){
            super.paint(g);
            Shape shape = setTheValue();
            shape.paint(g);
            setVisible(true);
        }
    }
}

