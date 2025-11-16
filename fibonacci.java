import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which you want to print");
        n = sc.nextInt();
        System.out.print(a + " " + b);
        for (i = 2; i < n; i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}
