import java.io.*;


public class CHAR_LINES_WORDS{
    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        
        PrintWriter writer = new PrintWriter("output.txt");

        int lc = 0;
        int cc = 0;
        int wc = 0;

        String line;

        while((line = reader.readLine())!= null){
            lc++;

            String[] words = line.split(" ");
            wc += words.length;
            cc += line.length();

        writer.println("Number of characters: " + cc);
        writer.println("Number of lines: " + lc);
        writer.println("Number of words: " + wc);

        System.out.println("Number of characters: " + cc);
        System.out.println("Number of lines: " + lc);
        System.out.println("Number of words: " + wc);
        }
        writer.close();
        reader.close();
    }
}