public class ArithmeticExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException!");
        }
    }
}