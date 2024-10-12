import java.util.LinkedList;
import java.util.Queue;

class p36 {
    public static void main(String[] args) {
        System.out.println("\n 23DIT047");
        // Create a shared buffer
        Buffer buffer = new Buffer(5); // Buffer size of 5

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private final Queue<Integer> queue;
    private final int maxSize;

    public Buffer(int size) {
        this.queue = new LinkedList<>();
        this.maxSize = size;
    }

    // Method for producer to add items
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == maxSize) {
            wait(); // Wait if the buffer is full
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer that an item has been added
    }

    // Method for consumer to remove items
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait if the buffer is empty
        }
        int value = queue.remove();
        System.out.println("Consumed: " + value);
        notify(); // Notify producer that an item has been removed
        return value;
    }
}

class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                buffer.produce(value);
                value++;
                Thread.sleep(500); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
