import java.util.Random;
import java.util.Scanner;
public class p5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random r = new Random();
int[] guess = new int[5];
int g = r.nextInt(100);

for(int i=0;i<5;i++)
{
System.out.println("Guess the number");
guess[i] = sc.nextInt();
if(guess[i]==g)
{
System.out.println("Congratulations! You guessed the number correct");
}
else if(Math.abs(guess[i]-g)<30) // use Math.abs to get absolute difference
{
System.out.println("You are close");
}
else
{ System.out.println("You are far away");
}
}
System.out.println("The number is "+g);
System.out.println("23DIT047");
}
}