import java.util.*; 
interface Shape { 
double getArea(); 
String getColor(); 
} 
class Circle implements Shape { 
 double radius; 
 String color; 
 public Circle(double radius, String color) { 
 this.radius = radius; 
this.color = color; 
 } 
 public double getArea() { 
return Math.PI * radius * radius; 
 } 
 public String getColor() { 
 return color; 
 } 
} 
class Rectangle implements Shape { 
 double length; 
double width; 
 String color;  
 public Rectangle(double length, double width, String color) { 
this.length = length; 
 this.width = width; 
this.color = color; 
 } 
 public double getArea() { 
 return length * width; 
 } 
 public String getColor() { 
 return color; 
 } 
} 
public class p22 { 
 public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
 System.out.print("Enter radius of the circle: "); 
double circleRadius = sc.nextDouble(); 
System.out.print("Enter color of the circle: "); 
 String circleColor = sc.next(); 
 System.out.println(""); 
 System.out.println(""); 
 System.out.println("::::::Details About Circle::::::"); 
 Circle circle = new Circle(circleRadius, circleColor); 
 System.out.println("Circle Area: " + circle.getArea()); 
 System.out.println("Circle Color: " + circle.getColor()); 
 System.out.println(""); 
 System.out.println(""); 
 
 System.out.print("Enter length of the rectangle: "); 
double rectangleLength = sc.nextDouble(); 
System.out.print("Enter width of the rectangle: "); double 
rectangleWidth = sc.nextDouble(); 
System.out.print("Enter color of the rectangle: "); 
 String rectangleColor = sc.next(); 
 System.out.println(""); 
 System.out.println(""); 
 System.out.println("::::::Details About Rectangle::::::"); 
 Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth, rectangleColor); 
 System.out.println("Rectangle Area: " + rectangle.getArea()); 
 System.out.println("Rectangle Color: " + rectangle.getColor()); 
 System.out.println("23DIT047");
 sc.close(); 
 } 
}
