package huhu;
import java.util.*;

class Perfect implements Runnable{

    int[] a =new int[100];
    int k=1;
    void pernum(){
    for(int i=0;i<=100;i++){
        int sum=0;
        for(int j=0;j<i;j++){
            if(i%j==0){
                sum+=j;
            }
        }
        if(sum == i){
            a[k]=i;
        }
    }}

    public void run(){
        Thread.currentThread().setName("hehe");

        System.out.println(Thread.currentThread().getName());

        Random rand = new Random();
        int random = rand.nextInt(5);
        System.out.println(a[random]);
    }
}

class fiba implements Runnable{

    int num1=0,num2=1;
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<100;i++){
            System.out.println(num1 + " ");
            int num3 = num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}

class prime implements Runnable{
    int flag=0;
    public void run(){
        Thread.currentThread().setName("uhuhu");

        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<100;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }

    }
}

public class LibraryBook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Thread t1,t2,t3;
    
        System.out.println("1.Perfect   2.Fibanocci   3.Prime   4.Exit");
        System.out.print("Enter choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1: t1 = new Thread(new Perfect());
                    t1.start();
                    break;
            case 2: t2 = new Thread(new fiba());
                    t2.start();
                    break;
            case 3: t3 =new Thread(new prime());
                    t3.start();
                    break;
            case 4: break;
            default:   System.out.println("Invalid");break;
        }
        sc.close();
    }
}
