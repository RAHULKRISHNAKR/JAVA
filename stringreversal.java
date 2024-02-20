package huhu;
import java.util.*;

public class stringreversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        System.out.println(builder);
        sc.close();

    }
}

/*char[] chararr = new char[100];
        char[] newarr = new char[s.length()];
        chararr = s.toCharArray();
        int j=0;
        for(int i=chararr.length-1;i>=0;i--){
            System.out.println(chararr[i]);
            newarr[j] = chararr[i];
            j++;
        }
        String snew = new String(newarr);
        System.out.println(snew);*/