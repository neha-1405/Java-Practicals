import java.util.*;

class p23
{
    public static void main(String args[])
    {
        int x,y;
        System.out.println("Enter the value of x and y");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

    try
    {
        double z=x/y;
        System.out.println("Value:"+z);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally
    {
        System.out.println("23DIT047");
    }

}
}