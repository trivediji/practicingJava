import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class argu{

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        String firstNumberString = bufferedReader.readLine();
        int firstNumber = Integer.parseInt(firstNumberString);
        System.out.print("Enter the second number: ");
        String secondNumberString = bufferedReader.readLine();
        int secondNumber = Integer.parseInt(secondNumberString);
        System.out.println("The first number is"+firstNumber);
        System.out.println("The second number is" +secondNumber);
    }
}