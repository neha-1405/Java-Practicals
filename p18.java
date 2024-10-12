public class Rectangle {

    private float length;
    private float breadth;

    public Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    //Method for calculating area

    public void printArea()
    {
        float area = length * breadth;
        System.out.println("Area: " + area);
    }

    //Metgod for calculating perimeter
    
    public void printPerimeter()
    {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Square extends Rectangle{

    //Constructor
    public Square(float side)
    {
        super(side,side);
    }
}

class N{
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[2];

        shapes[0] = new Rectangle(10,5);
        shapes[1] = new Square(6);

        for(int i=0; i<shapes.length;i++)
        {
            System.out.println("\nShapes: "+ (i+1)+ " ");
             shapes[i].printArea();
             shapes[i].printPerimeter();
        }
        System.out.println("\n23DIT047");
    }
    
}
