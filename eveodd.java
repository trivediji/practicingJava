import java.util.Scanner;

public class eveodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Its A even number");
                evenSum += num;
            } else {
                System.out.println("its a odd number");
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}
