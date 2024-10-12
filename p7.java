import java.util.Scanner;
public class p7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] nums = new int[50];
int count =0;
System.out.println("Enter the length of array: ");
int n = sc.nextInt();
System.out.println("Enter elements of array: ");
for(int i=0;i<n;i++)
{
nums[i] = sc.nextInt();
}
for(int i=0; i<n; i++)
{
if(nums[i] == 9)
{
count++; }
}
System.out.println("There are "+count+" 9's in the given array");
System.out.println("\n23DIT047");}
}
