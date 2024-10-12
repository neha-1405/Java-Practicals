import java.util.Scanner;

public class p2 {
    public static void main(String[] args){

        char[] a={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String[] b={ ".-----", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",".---","-.-", ".-..", "--", "-.", "---",".--.", "--.-", ".-.", "...", "-","..-", "...-", ".--", "-..-", "-.--","--.."};
        int n;
        do {
            System.out.println("CHOOSE \n 1 for string to morse \n 2 for morse code to stirng");
            Scanner obj = new Scanner(System.in);
            int x=obj.nextInt();
            if(x==1){
                System.out.println("CHAR TO MORSE::::: \n");
                System.out.print("ENTER YOUR CHARACTER: ");
                Scanner obj1 = new Scanner(System.in);
                String line=obj1.nextLine();
                for(int i=0;i<line.length();i++){
                    char s = line.charAt(i);
                    if(s==a[i]){
                        System.out.print(b[i]);
                    }
                }
            }
            else {
                System.out.println("MORSE TO CHAR::::: \n");
                System.out.println("ENTER YOUR MORSE CODE (use spaces to separateeach morse character): ");
                Scanner obj2 = new Scanner(System.in);
                String line = obj2.nextLine();
                String[] s2 = line.split(" ");
                String cod = "";
                for (int i = 0; i < s2.length; i++) {
                    int index = 0;
                    for (int j = 0; j < b.length; j++) {
                        if (b[j].equals(s2[i])) {
                            index = j;
                        }
                    }
                    cod = cod + a[index];
                }
                System.out.println("String : " + cod);
            }
            System.out.println("\n Press 1 to continue further and 2 to exit: ");

            Scanner obj5= new Scanner(System.in);
            n=obj5.nextInt();
        } while (n!=2);
        System.out.println("23DIT047");
        obj5.close();
    }
}
