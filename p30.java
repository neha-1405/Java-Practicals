
import java.io.*;

public class p30 {
    public static void main(String[] args) {
        demonstrateByteStream();
        demonstrateCharacterStream();
        demonstrateBufferedReaderWriter();
    }

    public static void demonstrateByteStream() {
        String byteFile = "bytestream.dat";
        
       
        try (FileOutputStream fos = new FileOutputStream(byteFile)) {
            String data = "Hello, Byte Stream!";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to byte stream file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(byteFile)) {
            int byteRead;
            System.out.print("Data read from byte stream file: ");
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void demonstrateCharacterStream() {
        String charFile = "charstream.txt";
        try (FileWriter fw = new FileWriter(charFile)) {
            fw.write("Hello, Character Stream!");
            System.out.println("Data written to character stream file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(charFile)) {
            int charRead;
            System.out.print("Data read from character stream file: ");
            while ((charRead = fr.read()) != -1) {
                System.out.print((char) charRead);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void demonstrateBufferedReaderWriter() {
        String bufferedFile = "buffered.txt";
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(bufferedFile))
        ) {
            System.out.print("Enter text (type 'exit' to finish):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Data written to buffered file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(bufferedFile))) {
            String line;
            System.out.println("Data read from buffered file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("23DIT047");
    }
}
