public class sumfunction {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        int x, y, sum;
        x=10;
        y=20;
        sum = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum);
    }
}