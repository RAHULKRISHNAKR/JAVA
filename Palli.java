package huhu;
import java.util.*;
import java.io.*;

public class Palli {
    public static boolean isPalindrome(String str){
        int flag=1;
        int n=str.length();
        for(int i=0;i<n;i++){
            if (str.charAt(i)!=str.charAt(n-1-i)){
                flag=0;
                break;        
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FileWriter ispal;
        FileWriter notpal;
        try{
            ispal = new FileWriter("input.txt");
            notpal = new FileWriter("output.txt");
            while(true){
                System.out.print("Enter a string:");
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("done")){
                    break;
                }
                if(isPalindrome(input)){
                    ispal.write(input + "\n");
                }
                else{
                    notpal.write(input + "\n");
                }
            }
            ispal.close();
            notpal.close();
        }catch(Exception e){System.out.println("Erroror");}
        sc.close();
    }
}
