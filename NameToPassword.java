import java.util.Random;
import java.util.*;
public class NameToPassword {

    public static String generatePassword(String name) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Combine first and last name characters
        if (name.contains(" ")) {
            password.append(name.substring(0, 2).toUpperCase());
            int lastIndex = name.lastIndexOf(" ");
            password.append(name.substring(lastIndex + 1, lastIndex + 3).toUpperCase());
        } else {
            password.append(name.substring(0, 4).toUpperCase());
        }

        // Add 8 random alphanumeric characters
        for (int i = 0; i < 8; i++) {
            char randomChar = (char) (random.nextInt(62) + '0');
            if (randomChar > '9') {
                randomChar = (char) (randomChar + 39); // Shift to uppercase letters
            }
            password.append(randomChar);
        }

        // Shuffle the characters for added security
        char[] passwordChars = password.toString().toCharArray();
        for (int i = passwordChars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = passwordChars[i];
            passwordChars[i] = passwordChars[j];
            passwordChars[j] = temp;
        }

        return new String(passwordChars);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Replace with the actual name
        String password = generatePassword(name);
        System.out.println("Generated password: " + password);
    }
}
