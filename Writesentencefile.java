import java.io.*;
class Writesentencefile
{
    public static void main(String arg[]) throws IOException
    {
        FileOutputStream f;
        FileInputStream fin;
        String s; 
        try
        {
            f= new FileOutputStream("Sample.txt"); 
            s="Welcome to OOP";
            byte b[]=s.getBytes(); //converting string into byte array
            f.write(b);
            f.close();
            fin = new FileInputStream("Sample.txt");
            int c;
            do{
                c = fin.read();
                if(c!=-1){
                    System.out.print((char)c);
                }
            }while(c!=-1);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found"); 
        }
        
    } 
}
