package huhu;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FisFos {
    public static void main(String[] args)throws Exception{
        int flag=0;
        char[] arr = new char[100];
        try{
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte[] buffer = new byte[1024];
            int  bytesread;
            int i=0;
            while((bytesread = fis.read(buffer)) > 0){
                char k = (char)bytesread;
                fos.write(buffer,0,bytesread);
                arr[i] = k;
                i++;
            }
            for(int j=0;j<i;j++){
                System.out.println(arr[j]);
            }
            fis.close();
            fos.close();
        }catch(Exception ae){flag =1;}
        if(flag==1){
            System.out.println("error");
        }

    }
    
}
