import java.util.Scanner;

class IndexOutOfBoundException extends Exception {

    public IndexOutOfBoundException(String message) {
        super(message);
    }
}

public class Tuto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number < 11 || number > 49) {
                scanner.close();
                throw new IndexOutOfBoundException("Number is out of bounds");
             
            
            } else {
                System.out.println("The square of the number is: " + (number * number));
            }
        } catch (IndexOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

