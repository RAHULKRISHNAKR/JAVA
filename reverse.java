import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a);
        System.out.println(Integer.reverse(a));
        sc.close();
    }
}
