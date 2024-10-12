import java.util.Scanner;

 public class com{
    private double real;
    private double imaginary;

    // Constructer
    public com(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Function for + operator

    public com add(com other)
    {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;

        return new com(realSum,imaginarySum);
    }

    // Function for - operator

    public com subtract(com other)
    {
        double realSub = this.real - other.real;
        double imaginarySub = this.imaginary - other.imaginary;

        return new com(realSub,imaginarySub);
    }

    // Function for * operator

    public com product(com other)
    {
        double realproduct = this.real * other.real - this.imaginary ;
        double imaginaryproduct = this.real*other.imaginary + this.imaginary * other.real ;

        return new com(realproduct,imaginaryproduct);
    }

    public void print()
    {
        System.out.println(this.real + " + " + this.imaginary + " i ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        com num1 = new com(3,2);
        com num2 = new com(1,7);

        System.out.println("First Complex Number: ");
        num1.print();

        System.out.println("Second Complex Number: ");
        num2.print();

        for(int i=0; i<3; i++){
            System.out.println("Enter 1 for Addition + ");
            System.out.println("Enter 2 for Subtraction - ");
            System.out.println("Enter 3 for Product of the sum * ");

            int value = sc.nextInt();
            com result;

            switch (value) {
                case 1:

                    result = num1.add(num2);
                    System.out.println("Sum: ");
                    result.print();;
                    break;

                case 2:

                    result = num1.subtract(num2);
                    System.out.println("Difference:" );
                    result.print();;
                    break;

                case 3:

                    result = num1.product(num2);
                    System.out.println("Product");
                    result.print();;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
sc.close();
        System.out.println("23DIT047");

    }
}

