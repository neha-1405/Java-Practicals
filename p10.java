public class p10 {
public static void main(String[] args) {

String str ="CHARUSAT UNIVERSITY";
System.out.println("The string is: "+str);
System.out.println("Length of string is: "+str.length());
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='H')
str = str.substring(0,i) + 'N' +str.substring(i+1);
}
System.out.println("The updated string is: "+str);
System.out.println("The string in lowercase will be :"+str.toLowerCase());
System.out.println("\n23DIT047"); }
}