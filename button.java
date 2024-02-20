import java.awt.*;
import javax.swing.*;


public class button extends JFrame {
    JFrame jf;JButton b;
    public button(){
        jf = new JFrame();
        b =new JButton("fuck you");
        jf.setSize(500,300);

        jf.add(b);
        jf.setVisible(true);

    }
    public static void main(String[] args){
        new button();
    }
    
}
