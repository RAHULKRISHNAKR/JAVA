import java.io.*;

public class CommandLine {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("null");
        pw.println(-7);
        pw.println(24e-7);
        }
    }
    
     /*String[] s = new String[100];
        int flag =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter words and enter stop to terminate\n");
        try{
            for(int i =0;i<100;i++){
                s[i] = br.readLine();
                flag++;
                if(s[i].equals("stop"))
                    break;
            }
        }catch(Exception ae){}
        finally{
            for(int i=0;i<flag;i++){
                System.out.println(s[i]);
            }
        }*/