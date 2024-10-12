import java.util.Scanner;
public class p9 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter Your string: ");

String str = input.nextLine();
 
 char[] array = str.toCharArray();

for(int i=0;i<array.length;i++)
{
if(array[i] >= 97 && array[i] <= 122)
{
array[i] = (char) (array[i] - 32);
}
}
String upper = new String(array);
System.out.println("Your string in UPPER-case: "+ upper);
 
System.out.println("Your string in lower-case: "+str.toLowerCase());
char[] arr = str.toCharArray();

String s ="";
int n = str.length();
for(int i=0;i<n;i++)
{
s = s+ str.charAt(n-1-i);
}
System.out.println("Printing the reversed array: "+ s);
System.out.println("\n23DIT047");
}
}