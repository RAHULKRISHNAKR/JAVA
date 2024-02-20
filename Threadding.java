package huhu;


class X implements Runnable{
    public void run(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException ie){}
        System.out.println("State of Thread t1 while it invoked join() on t2" + Threadding.t1.getState());
    
        try{Thread.sleep(200);}catch(InterruptedException ie){}
    }
}



public class Threadding implements Runnable {

    public static Thread t1;
    public static Threadding obj;
    public static void main(String[] args){
        obj = new Threadding();
        t1 = new Thread(obj);
        System.out.println("State of thread after spawning it"+ t1.getState());
        t1.start();
        System.out.println("State after start"+ t1.getState());
    }
    public void run(){
        Thread t2 = new Thread(new X());
        System.out.println("state of t2 After run"+ t2.getState());
        t2.start();
        System.out.println("State after start "+ t2.getState());
        try{
            Thread.sleep(100);        System.out.println("State of t2 after sleep"+ t2.getState());

        }catch(InterruptedException ie){}
        System.out.println("State of t2 after sleep"+ t2.getState());
        try{t2.join();}catch(InterruptedException ie){}
        System.out.println("state after join:" + t2.getState());
    }
}
