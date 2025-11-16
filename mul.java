public class mul {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = divideNumbers(numbers, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exceptions (e.g., divide by zero)
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exceptions
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // Handle other types of exceptions
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Code in the finally block will always be executed
            System.out.println("Finally block executed.");
        }
    }

    // A method that may throw exceptions
    public static int divideNumbers(int[] numbers, int index) {
        return numbers[index] / 2;
    }
}
