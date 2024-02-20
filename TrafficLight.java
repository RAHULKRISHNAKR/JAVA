package huhu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight extends JPanel implements ActionListener{
    private JRadioButton r1,r2,r3;
    private Color red_c,yellow_c,green_c;

    public TrafficLight(){
        setBounds(0,0,640,480);
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Green");
        
        r1.setSelected(true);
        yellow_c = getBackground();
        green_c=getBackground();

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);

        add(r1);add(r2);add(r3);

        r1.addActionListener(this);r2.addActionListener(this);r3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(r1.isSelected() == true){
            red_c = Color.RED;
            yellow_c = green_c = getBackground();
        }
        else if(r2.isSelected() == true){
            yellow_c=Color.YELLOW;
            red_c=green_c=getBackground();
        }
        else{
            green_c=Color.GREEN;
            red_c=yellow_c=getBackground();
        }
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawOval(50,50,50,50);
        g.drawOval(50,110,50,50); 
        g.drawOval(50,170,50,50);

        g.setColor(red_c);
        g.fillOval(50,50,50,50);

        g.setColor(yellow_c);
        g.fillOval(50,110,50,50);

        g.setColor(green_c);
        g.fillOval(50,170,50,50);

    }

    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(640,480);
        jf.setLayout(null);
        TrafficLight t = new TrafficLight();
        jf.add(t);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
