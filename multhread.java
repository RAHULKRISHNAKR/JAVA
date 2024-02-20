package huhu;
import java.util.Random;
import java.util.Scanner;

class X implements Runnable{
    static int random;
    Random rand = new Random();

    public void run(){
        random = rand.nextInt(5);
        System.out.println("\nRandom number: "+ random);
    }
}

class Y implements Runnable{
    public void run(){
        if(X.random%2 ==0){
            System.out.println((X.random*X.random));
        }
    }
}

class Z implements Runnable{
    public void run(){
        if(X.random%2 !=0){
            System.out.println("\n"+(X.random*X.random*X.random));
        }
    }
}

public class multhread {
    public static void main(String[] args){
        System.out.println("Enter limit");
        Scanner sc =new Scanner(System.in);
        int limit = sc.nextInt();
        sc.close();
        for(int i=0;i<=limit;i++){
            Thread objX = new Thread(new X());
            Thread objY = new Thread(new Y());
            Thread objZ= new Thread(new Y());
            try{Thread.sleep(1000);}
            catch(Exception ae){}
            objX.run();
            objY.run();
            objZ.run();
        }
        
    }
}
