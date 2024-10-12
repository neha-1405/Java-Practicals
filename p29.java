import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p29 {
    public static void main(String[] args) {
        
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {
            int byteRead;
            
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred during file copying:");
            e.printStackTrace();
        }
        System.out.println("23DIT047");
    }
    
}