package huhu;
import java.io.*;

public class fiveil {
    public static void main(String[] args){
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader("input.txt"));
            String s;int i=1;
            while ((s = reader.readLine())!=null){
                System.out.print("Line no:" + i++);
                System.out.println(s);
            }
        }catch(Exception ee){}
    }
}
