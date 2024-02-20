package huhu;
import java.util.Scanner;

public class SSM {
    public static void main(String[] args){
        int i;
        System.out.println("Enter array of size 10");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        for(i=0;i<10;i++){
            arr[i] = sc.nextInt();
            sc.close();
        }
        
        for(i=0;i<10;i++){
            if(arr[i]!=arr[i+1]){
                break;
            }
        }
        sc.close();
        System.out.println(i+1);
        

    }
}
