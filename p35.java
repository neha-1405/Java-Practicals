public class p35 {
    public static void main(String[] args) {
        // Create three threads
        Thread firstThread = new Thread(new Task(), "FIRST");
        Thread secondThread = new Thread(new Task(), "SECOND");
        Thread thirdThread = new Thread(new Task(), "THIRD");
        
        // Set priorities
        firstThread.setPriority(3);
        secondThread.setPriority(Thread.NORM_PRIORITY); // Default priority is 5
        thirdThread.setPriority(7);
        
        // Start the threads
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        // Print the thread name and its priority
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
    }
}
