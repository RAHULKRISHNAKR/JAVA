package huhu;
public class Noolu1{  

    int contr = 1;  
    static int NUM; 

    public void displayOddNumber(){   
        synchronized (this){  
            while (contr < NUM){  
                while (contr % 2 == 0){    
                    try{  
                        wait();  
                    }  
                    catch (InterruptedException ex){  
                        ex.printStackTrace();  
                    }  
                }  
                System.out.println(contr + Thread.currentThread().getName());   
                contr = contr + 1;  
                notify();  
            }  
        }  
    }  

    public void displayEvenNumber(){  
        synchronized (this){  
            while (contr < NUM){  
                while (contr % 2 == 1){  
                    try{  
                        wait();  
                    }  
                    catch (InterruptedException ex){  
                        ex.printStackTrace();  
                    }  
                }  
                System.out.println(contr + Thread.currentThread().getName());  
                contr = contr +1;  
                notify();  
            }  
        }  
    }  
    
    public static void main(String[] argvs){  
        NUM = 20;  
        Noolu1 oe = new Noolu1();  
        Thread th1 = new Thread(new Runnable(){  
            public void run(){  
                oe.displayEvenNumber();  
            }  
        });  

        Thread th2 = new Thread(new Runnable(){  
            public void run()  
            {  
                oe.displayOddNumber();  
            }  
        });  

        th1.start();  
        th2.start();  
    }  
}