package huhu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator_RIyal extends JFrame implements ActionListener{
    JFrame jf;
    
    JTextField tf;
    
    JButton numberbutt[] = new JButton[10];
    JButton funcbutt[] = new JButton[10];
    
    JButton add,sub,mul,div,mod;
    JButton eq,del,clr,neg,point;

    JPanel panel;

    double num1=0,num2=0,res=0;
    char operator;

    Calculator_RIyal(){
        jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(350,450);
        jf.getContentPane();
        jf.setLayout(null);
        jf.setResizable(false);

        tf = new JTextField();
        tf.setBounds(20,25,300,50);
        tf.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");

        eq = new JButton("=");
        del = new JButton("DEL");
        clr = new JButton("CLR");
        neg = new JButton("(-)");
        point = new JButton(".");

        funcbutt[0] = add;
        funcbutt[1] = sub;
        funcbutt[2] =mul;
        funcbutt[3] =div;
        funcbutt[4] =point;
        funcbutt[5] =eq;
        funcbutt[6] =del;
        funcbutt[7] =clr;
        funcbutt[8] =neg;
        funcbutt[9] =mod;


        for(int i=0;i<10;i++){
            funcbutt[i].addActionListener(this);
            funcbutt[i].setBorder(BorderFactory.createLineBorder(Color.RED,2));
        }

        clr.setBorder(BorderFactory.createLineBorder(Color.YELLOW,2));
        del.setBorder(BorderFactory.createLineBorder(Color.GREEN,2));

        panel = new JPanel();
        panel.setBounds(20,100,300,300);
        panel.setLayout(new GridLayout(5,4,10,10));
        panel.add(numberbutt[1]);
        panel.add(numberbutt[2]);
        panel.add(numberbutt[3]);
        panel.add(add);
        panel.add(numberbutt[4]);
        panel.add(numberbutt[5]);
        panel.add(numberbutt[6]);
        panel.add(sub);
        panel.add(numberbutt[7]);
        panel.add(numberbutt[8]);
        panel.add(numberbutt[9]);
        panel.add(mul);
        panel.add(point);
        panel.add(numberbutt[0]);
        panel.add(eq);
        panel.add(div);
        panel.add(mod);
        panel.add(neg);
        panel.add(clr);
        panel.add(del);

        jf.add(panel);
        jf.add(tf);
        jf.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        try{
            int err=0;
            for(int i=0;i<10;i++){
                if(e.getSource()==numberbutt[i]){
                    tf.setText(tf.getText().concat(String.valueOf(i)));
                }
                if(e.getSource() == point){
                    tf.setText(tf.getText().concat("."));
                }
                if(e.getSource()==add){
                    num1 = Double.parseDouble(tf.getText());
                    operator = '+';
                    tf.setText("");
                }
                if(e.getSource()==sub){
                    num1 = Double.parseDouble(tf.getText());
                    operator = '-';
                    tf.setText("");
                }
                if(e.getSource()==mul){
                    num1 = Double.parseDouble(tf.getText());
                    operator = '*';
                    tf.setText("");
                }
                if(e.getSource()==div){
                    num1 = Double.parseDouble(tf.getText());
                    operator = '/';
                    tf.setText("");
                }
                if(e.getSource()==mod){
                    num1 = Double.parseDouble(tf.getText());
                    operator = '%';
                    tf.setText("");
                }
                if(e.getSource() == eq){
                    num2 = Double.parseDouble(tf.getText());
                    switch(operator){
                        case '+': res = num1+num2;break;
                        case '-': res = num1-num2;break;
                        case '*': res = num1*num2;break;
                        case '/':   if(num2==0){
                                        err=1;
                                    }
                                    else{
                                        res = num1/num2;
                                    }
                                    break;

                        case '%': if(num2==0){
                            err=1;
                        }
                        else{
                            res = num1%num2;
                        }
                        break;
                    }    
                    if(err==0){
                        tf.setText(String.valueOf(res));
                        num1=res;
                    }
                    else{
                        tf.setText("Error!DEno cannot be zero");
                    }
                }
            }
            if()
        }catch(Exception ae){System.out.println("error");}
}
    public static void main(String[] args){
        new Calculator_RIyal();
    }
}
