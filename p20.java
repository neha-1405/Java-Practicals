public class Degree {
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
    
}
 class Undergraduate extends Degree
 {
    public void getUndergraduateDegree()
    {
        System.out.println("I am an Undergraduate");
    }
 }
 class Postgraduate extends Degree
 {
    public void getPostgraduateDegree()
    {
        System.out.println("I am an Postgraduate");
    }
 }

 class Main
 {
    public static void main(String[] args)
    {
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();

    System.out.println("Calling by an object: ");

        d.getDegree();
        u.getUndergraduateDegree();
        p.getPostgraduateDegree();

        System.out.println("23DIT047");
    }
 }
