import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingDemo{
    SwingDemo(){
        JFrame jf = new JFrame("An Event Example");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        jf.setSize(220,90);
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("CANCEL");
        JLabel l = new JLabel("Push A Button");

        b1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae){
            l.setText("OK Pressed");
           } 
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                l.setText("Get The F*ck OUt");
            }
        });

        jf.add(b1);jf.add(b2);jf.add(l);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }
        });
    }
}