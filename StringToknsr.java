import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToknsr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of inegrs:");
        String line = sc.nextLine();

        StringTokenizer ST = new StringTokenizer(line," ");
        int sum = 0;
        while(ST.hasMoreTokens()){
            int i = Integer.parseInt(ST.nextToken());
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }    
}
