public class p34 {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        incrementer.start();
    }
}

class Incrementer extends Thread {
    private int value = 0;

    @Override
    public void run() {
        while (true) {
            try {
                // Increment the value by 1
                value++;
                
                // Display the current value
                System.out.println("Current Value: " + value);
                
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break; // Exit loop if interrupted
            }
        }
    }
}
