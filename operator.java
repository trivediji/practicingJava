public class operator {
    public static void main(String[] args) {
        // Bitwise AND Operator (&)
        int num1 = 12;  // Binary: 1100
        int num2 = 6;   // Binary:  0110
        int resultAnd = num1 & num2; // Bitwise AND of num1 and num2
        System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is " + resultAnd);

        // Ternary Operator (Conditional Operator)
        int x = 10;
        int y = 20;
        int max = (x > y) ? x : y; // Ternary operator: If x is greater than y, max = x, else max = y
        System.out.println("The maximum of " + x + " and " + y + " is " + max);
    }
}
