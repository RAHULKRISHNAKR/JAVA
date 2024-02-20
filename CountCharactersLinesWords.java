import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class CountCharactersLinesWords {

    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object to read the text file
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        // Initialize charCount, wordCount and lineCount to 0
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // Read all the lines of the text file one by one into currentLine using reader.readLine() method
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            // Update lineCount each time we read the line into currentLine
            lineCount++;

            // Get the number of words in a line by splitting the currentLine by space
            String[] words = currentLine.split(" ");
            wordCount += words.length;

            // Update charCount by counting the number of characters in currentLine
            charCount += currentLine.length();
        }

        // Print the number of characters, words and lines in the text file
        System.out.println("Number of characters in the text file: " + charCount);
        System.out.println("Number of words in the text file: " + wordCount);
        System.out.println("Number of lines in the text file: " + lineCount);

        // Close the BufferedReader object
        reader.close();
    }
}