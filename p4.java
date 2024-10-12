import java.util.Scanner;
class p4
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
String[] products = {"motor","fan","tubes","wires","other items"};
double[] rate = {1500,700,1250,550,500};
double[] tax = {8,12,5,7,3};
int unit[];
unit = new int[5];
double pro_rate[];
pro_rate = new double[5];
int choice;
double total=0;
int x;
for(int i=0;i<5;i++)
{
    pro_rate[i] = rate[i] + (rate[i]*tax[i])/100;
    }
    do{
    System.out.println("Enter the number beside the item you want to buy 1.Motor 2.fan 3.Tube 4.Wire 5.other items");
    choice = input.nextInt();
    System.out.println("\nEnter the number of units you wish to purchase: ");
    unit[choice-1]= input.nextInt();
    switch(choice)
    {
    case 1:
    pro_rate[0] = pro_rate[0]*unit[0];
    total = total + pro_rate[0];
    break;
    case 2:
    pro_rate[1] = pro_rate[1]*unit[1];
    total = total + pro_rate[1];
    break;
    case 3:
    pro_rate[2] = pro_rate[2]*unit[2];
    total = total + pro_rate[2];
    break;
    case 4:
    pro_rate[3] = pro_rate[3]*unit[3];
    total = total + pro_rate[3];
    break;
    case 5:
    pro_rate[4] = pro_rate[4]*unit[4];
    total = total + pro_rate[4];
    break;
}
System.out.println("Do you wish to buy other products (Enter 1 or 0): ");
x = input.nextInt();
}while(x != 0);
System.out.println("Your total bill is: " + total);
System.out.println("23DIT047");
}
}