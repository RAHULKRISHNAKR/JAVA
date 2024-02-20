package huhu;
import java.io.*;  
public class Fayil {  
public static void main(String[] args) {  
    File f=new File("D:\\MACE_FILES\\vs_code_archive\\OOPJ\\hehe");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        System.out.println(filename);  
    }  
}  
} 