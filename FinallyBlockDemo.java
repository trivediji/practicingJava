public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divideNumbers(10, 2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catching and handling the exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Code in the finally block will always be executed
            System.out.println("Finally block executed.");
        }
    }

    // A method that may throw an exception
    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
