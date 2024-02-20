import java.io.FileWriter;
import java.io.IOException;

public class Tutorial {

    public static void main(String[] args) throws IOException {
        String str = "Hello, World!";

        // Read alternative letters from the given string and write it to a file named file.txt
        FileWriter fileWriter = new FileWriter("file.txt");
        for (int i = 0; i < str.length(); i += 2) {
            fileWriter.write(str.charAt(i));
        }
        fileWriter.close();

        // Write the entire file to file file2.txt
        fileWriter = new FileWriter("file2.txt");
        fileWriter.write(str);
        fileWriter.close();

        // Write the string starting from index 2 up to 3 letters into file 3.txt
        fileWriter = new FileWriter("file3.txt");
        fileWriter.write(str.substring(2, 5));
        fileWriter.close();
    }
}