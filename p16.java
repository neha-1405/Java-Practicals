public class parent {

    //Method or function
    public void printParent()
    {
        System.out.println("This is the parent class.");
    }
}

class child extends parent {

    //Method or function

    public void printChild() {
        System.out.println("This is the child class.");
    }

}

 class Main{

    public static void main(String[]args){

        parent pObj = new parent();
        pObj.printParent();

        child cObj = new child();
        cObj.printChild();

        // Calling parent class using child class object

        cObj.printParent();

       

        System.out.println("23DIT047");
    }
}
