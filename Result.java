package hehe;
import java.util.Scanner;

interface Sports{
    final double sportwt = 6.0;
    abstract void putwt();
}

class Student{
    int rollNo;
    void getRoll(int n){
        rollNo = n;
    }
    void putRoll(){
        System.out.println("Roll Number :"+rollNo);
    }
}

class Test extends Student{
    int term1,term2;
    void getMarks(int m, int n){
        term1 = m;
        term2 = n;
    }
    void putMarks(){
        System.out.print("Marks\n\tTerm 1:"+term1+"\tTerm 2:"+ term2);
    }
}

public class Result extends Test implements Sports{
    
    @Override
    public void putwt() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'putwt'");
        System.out.println("Spots Weightage:" + sportwt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Roll NUmber");
        int p = sc.nextInt();
        Test t = new Test();

        t.getRoll(p);
        t.getMarks(30, 20);
        t.putRoll();
        t.putMarks();
        
        Result r = new Result();
        r.putwt();
        
        System.out.println("Total = "+ (t.term1 + t.term2 + sportwt ));
        sc.close();
    }
}
