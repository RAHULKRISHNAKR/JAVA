package hehe;
import java.io.*;

public class File1{
    public static void main(String[] args)throws IOException{
        FileReader reader;
        FileWriter writer;
        BufferedReader br;
        int linecount,wordcount,charcount;
        linecount=wordcount=charcount=0;
        try{
            reader = new FileReader("input.txt");
            br = new BufferedReader(reader);
            writer = new FileWriter("output.txt");
            String s;
            while((s = br.readLine())!=null){
                linecount++;
                String[] words = s.split(" ");
                wordcount +=words.length;
                charcount += s.length();
                writer.write(s+"\n");
            }
            reader.close();writer.close();
        }
        catch(IOException ae){}
        System.out.println(wordcount + "  " + linecount + "  "+ charcount );
    }
}