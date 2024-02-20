package hehe;
public class Exception {
    public static void main(String[] args)throws ArithmeticException {
        try{
            int x = 10;
            int y=0;
            int z = x/y;
            System.out.println(z);
        }
        catch(ArithmeticException ae){
            System.out.println("Error cannot divide");
        }
        finally{
            System.out.println("This is the end of program");
        }
    }
}
