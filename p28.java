import java.io.*;
import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {

        demonstrateWrapperClass();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name to search in: ");
        String fileName = scanner.nextLine();
        
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.nextLine();
        
        searchWordInFile(fileName, searchWord);
        
        scanner.close();
    }
    public static void searchWordInFile(String fileName, String searchWord) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println("Found '" + searchWord + "' on line " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("The word '" + searchWord + "' was not found in the file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void demonstrateWrapperClass() {
        System.out.println("Demonstrating Integer Wrapper Class:");

    
        Integer num1 = new Integer(42);  
        Integer num2 = Integer.valueOf(100);  

 
        String strNum = "123";
        Integer num3 = Integer.parseInt(strNum);

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Minimum value of Integer: " + Integer.MIN_VALUE);
        System.out.println("Binary representation of num3: " + Integer.toBinaryString(num3));
        System.out.println("Hexadecimal representation of num3: " + Integer.toHexString(num3));

        int primitiveInt = num1;  
        Integer wrapperInt = primitiveInt;  

        System.out.println("Demonstrating auto-unboxing: " + primitiveInt);
        System.out.println("Demonstrating auto-boxing: " + wrapperInt);
        System.out.println("23DIT047");
        System.out.println(); 
    }
}