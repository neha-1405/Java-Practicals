public class p24 {
        public static void main(String[] args) {
            try {
                int result = divideByZero();
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException: " + e.getMessage());
            }
            System.out.println("Program continues after the exception handling.");
            System.out.println("23DIT047");
        }
    
        public static int divideByZero() {
            return 10 / 0;
        }
    }

