import java.util.Scanner;
public class p6 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter the string");
String str = input.nextLine();
System.out.println("Enter the number of length of string: ");
int l=input.nextInt();
System.out.println("Enter the number of times you want to print the string: ");
int n=input.nextInt();
int i=0;
do {
if(str.length()>=l)
{ for(int j=0;j<l;j++)
{
System.out.print(str.charAt(j));
} }
else{
System.out.print(str); }
i++;
} while (i<n);
System.out.println("\n23DIT047");
} 
}