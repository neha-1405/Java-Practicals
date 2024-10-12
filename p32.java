
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
public class p32{
    private static AtomicLong totalSum = new AtomicLong(0);

    static class SumThread extends Thread {
        private final long start;
        private final long end;

        SumThread(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            totalSum.addAndGet(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (the number to sum up to): ");
        long N = scanner.nextLong();

        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();

        Thread[] threads = new Thread[numThreads];
        long numbersPerThread = N / numThreads;

        for (int i = 0; i < numThreads; i++) {
            long start = i * numbersPerThread + 1;
            long end = (i == numThreads - 1) ? N : (i + 1) * numbersPerThread;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum.get());

        System.out.println("23DIT047");
        scanner.close();
    }
}
