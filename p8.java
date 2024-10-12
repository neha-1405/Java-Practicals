import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text you want to transfrom: ");
        String text = input.nextLine();
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < 2; j++) {
                str = str + text.charAt(i);
            }
        }
        System.out.println("Your transformed text is: ");
        System.err.println(str);
        System.out.println("\n23DIT047");
    }
}
