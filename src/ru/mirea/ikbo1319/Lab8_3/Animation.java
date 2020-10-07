package Lab8_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class Animation extends JFrame {
    private int x =0,i=0;
    private String []arr = new String[4];

    public  Animation(String name){
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,400,800,800);
        Timer timer = new Timer(79, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        arr[0]="C:\\Users\\user\\Desktop\\Lightshot\\Screenshot_1.png";
        arr[1]="C:\\Users\\user\\Desktop\\Lightshot\\Screenshot_2.png";
        arr[2]="C:\\Users\\user\\Desktop\\Lightshot\\Screenshot_3.png";
        arr[3]="C:\\Users\\user\\Desktop\\Lightshot\\Screenshot_4.png";
        timer.start();
        setVisible(true);
        add(new abc());
    }
    class abc extends JComponent{
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Image image = new ImageIcon(arr[i]).getImage();

            if(i==3){
                i=0;
            }
            else{
                i++;
            }

            g.drawImage(image,x,0,null);
            x+=15;
            if(x>700){
                x=0;
            }
        }
    }
}
