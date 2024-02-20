package hehe;
import java.io.*;

public class File2 {
    public static void main(String[] args)throws IOException {
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin = new FileInputStream("input.txt");
            fout = new FileOutputStream("output.txt");
            byte[] buffer = new byte[1024];
            int byteread;
            while((byteread=fin.read(buffer))!=-1){
                fout.write(buffer, 0, byteread);
            }
        }
        catch(IOException ae){}
    }
}
