package huhu;
import java.io.*;

public class FrFw {
    public static void main(String[] args){
        FileWriter writer;
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader("input.txt"));
            writer = new FileWriter("output.txt");
            int linecount =0;
            int wrdcount =0;
            int charcount =0;
            String line;
            while((line= reader.readLine()) != null){
                linecount++;
                String[] words = line.split(" ");
                wrdcount += words.length;
                charcount += line.length();
            }
            writer.write("Number of lines: "+ linecount + "\nWords:" + wrdcount + "\nChar count" + charcount );
            reader.close();
            writer.close();
        }catch(Exception e){System.out.println("error");}
        
    }
}
