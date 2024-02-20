class Test{   
   void test(){
        System.out.println("Empty");
        }
    void test(int a) {
        System.out.println("a: " + a);
        }
    void test(int a, int b) {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

public class Overloading {
    public static void main(String args[])
    {
        Test ob = new Test();
        ob.test();
        ob.test(10);
        ob.test(2, 5);
    }
}
