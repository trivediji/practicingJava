public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];

            System.out.println(arr[5] / 0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}