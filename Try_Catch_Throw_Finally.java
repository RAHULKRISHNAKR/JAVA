public class Try_Catch_Throw_Finally {
    public static void main(String[] args) throws Exception {
        try {
            // Code that may throw an exception
            int x = 10;
            int z = x / 0;
            z= z+x;
        } catch (ArithmeticException e) {
            // Code to handle the ArithmeticException
            System.out.println("Division by zero");
        } finally {
            // Code that will always be executed, regardless of whether an exception is thrown or not
            System.out.println("Finally block executed");
        }
    }
}
