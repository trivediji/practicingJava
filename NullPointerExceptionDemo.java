public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length()); // This line will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot call methods on null objects!");
        }
    }
}