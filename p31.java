class Mythread1 extends Thread{

    public void message()
    {
        System.out.println("Hello World from Thread1");
    }

}

class Mythread2 implements Runnable{

    public void message()
    {
        System.out.println("Hello World from Thread2");
    }
    public void run(){
        message();
    }

}
public class Mein {
    public static void main(String[] args)
    {
        Mythread1 t1 = new Mythread1();
        t1.start(); //calling function or method 

        Mythread2 t2 = new Mythread2(); // t2 is a bullet and t and thread behave likes a is gun we need to feel gun by bullet
       
        Thread t = new Thread(t2); //Passing Runnable to thread
        t.start();
        System.out.println("23DIT047");
 
    }
}
