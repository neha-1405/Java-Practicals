import java.util.Random;

public class p33 {
    public static void main(String[] args) {
        Random rand = new Random();
        NumberGeneratorThread generator = new NumberGeneratorThread(rand);
        SquareCalculatorThread squareCalculator = new SquareCalculatorThread(generator);
        CubeCalculatorThread cubeCalculator = new CubeCalculatorThread(generator);

        generator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}

class NumberGeneratorThread extends Thread {
    private Random rand;
    private volatile int number;

    public NumberGeneratorThread(Random rand) {
        this.rand = rand;
    }

    @Override
    public void run() {
        while (true) {
            number = rand.nextInt(100); // Generate random numbers from 0 to 99
            System.out.println("Generated number: " + number);
            synchronized (this) {
                notifyAll(); // Notify the other threads that a new number is available
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNumber() {
        return number;
    }
}

class SquareCalculatorThread extends Thread {
    private NumberGeneratorThread generator;

    public SquareCalculatorThread(NumberGeneratorThread generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (generator) {
                try {
                    generator.wait(); // Wait for a new number
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int number = generator.getNumber();
                if (number % 2 == 0) {
                    int square = number * number;
                    System.out.println("Square of " + number + " is " + square);
                }
            }
        }
    }
}

class CubeCalculatorThread extends Thread {
    private NumberGeneratorThread generator;

    public CubeCalculatorThread(NumberGeneratorThread generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (generator) {
                try {
                    generator.wait(); // Wait for a new number
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int number = generator.getNumber();
                if (number % 2 != 0) {
                    int cube = number * number * number;
                    System.out.println("Cube of " + number + " is " + cube);
                }
            }
        }
    }
}