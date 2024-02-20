package hehe;
public class prime {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number to check for prime:");
        int a = sc.nextInt();
        if(a==0||a==1){
            System.out.println("Neither prime not composite\n");
        }
        //else if(isPrime(a)){
        //    System.out.println("Prime");
        //}
        else{
            System.out.println("Not prime");
        }
        sc.close();
    }
}
