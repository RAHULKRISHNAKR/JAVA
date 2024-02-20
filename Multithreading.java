package hehe;
import java.util.*;
import java.lang.Exception;

class X implements Runnable{
    Random r = new Random();
    static int random;
    public void run(){
        random = r.nextInt(25);
        System.out.println("Random number: " + random);
    }
}
class Y implements Runnable{
    public void run(){
        System.out.println("Square:" + (X.random*X.random));
    }
}
class Z implements Runnable{
    public void run(){
        System.out.println("Square:" + (X.random*X.random*X.random));
    }
}

public class Multithreading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Thread t1 = new Thread(new X());
        Thread t2 = new Thread(new Y());
        Thread t3 = new Thread(new Z());

        System.out.println("Enetr limit");
        int limit = sc.nextInt();

        for(int i=0;i<limit;i++){
            try{
                Thread.sleep(1000);
                t1.start();
                if(X.random%2 == 0){
                    t2.start();
                }
                else{
                    t3.start();
                }
            }
            catch(Exception ae){}
        }
    sc.close();
    }       
}