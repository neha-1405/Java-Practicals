import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p26{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify at least one file.");
            return;
        }

        for (String fileName : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.out.println("Error reading file: " + fileName + " - " + e.getMessage());
            }
        }
        System.out.println("23DIT047");
    }
}