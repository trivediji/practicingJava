import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class evenodd {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int evenSum = 0;
        int oddSum = 0;
         int count=0;
         int cou=0;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            String firstnum = bufferedReader.readLine();
            int num = Integer.parseInt(firstnum);
            if (num % 2 == 0) {
                System.out.println("Its A even number");
                evenSum += num;
                count++;
            } else{
                System.out.println("its a odd number");
                oddSum += num;
                cou++;
            }
        }
        System.out.println("Odd numbers are " + cou);
        System.out.println("edd numbers are " + count);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}
