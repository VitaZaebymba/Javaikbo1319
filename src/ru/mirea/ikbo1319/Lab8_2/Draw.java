package Lab8_2;

import javax.swing.*;
import java.awt.*;

public class Draw extends JFrame {
    private String []arr;
    public Draw (String name,String []arr){

        super(name);
        this.arr= arr;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,400,600 , 600);
        setVisible(true);
        add(new MyComponent());

    }
    public String add(String []arr){
        return arr[0];
    }
    class MyComponent extends JComponent{

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Font font = new Font("EVE",Font.BOLD,20);
            g.setFont(font);
            g.drawString("Hello, math",20,30);
            Image image = new ImageIcon(arr[0]).getImage();
            g.drawImage(image,0,0,null);
        }
    }
}
