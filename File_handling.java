import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;

public class File_handling {

    public static void main(String[] args) throws IOException {
        int flag =1;
        // Get the input and output file pathsff
        File obj = new File("input.txt");
        System.out.println("File Created!");
        File obj2 = new File("output.txt");
        System.out.println("File Created!");
        FileWriter myWriter = new FileWriter("input.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        String inputFilePath = obj.getAbsolutePath();
        String outputFilePath = obj2.getAbsolutePath();

        // Try-with-resources automatically closes the FileInputStream and FileOutputStream objects
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            // Read data from the input file and write it to the output file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            flag = 0;
        }

        // Print a success message
        if(flag ==1){
        System.out.println("File reading and writing done successfully!");
    }
    else {
        System.out.println("File handling failed");
    }}
}
