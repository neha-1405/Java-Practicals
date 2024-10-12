// Define the interface

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

// Implement the interface in the MyCalculator class
class MyCalculator implements AdvancedArithmetic {
    // Implementation of the divisor_sum method
    public int divisor_sum(int n) {
        int sum = 0;

        // Loop to find and sum all divisors of n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  // i is a divisor of n
                sum += i;
            }
        }

        return sum;
    }
}

// Main class to test the functionality
public class S {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        System.out.print("Enter the number: ");
        // Test with an example, n = 6
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Divisor sum of " + n + ": " + myCalculator.divisor_sum(n));

        System.out.println("23DIT047");
        sc.close();
    }
}

