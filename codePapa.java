import java.util.Scanner;

public class codePapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] responses = {"Of course, come on over!", "Sure, I'm here.", "I'd love to see you. What time works for you?"};

        System.out.println("Dad: May I come to you?");
        System.out.print("You: ");
        String userInput = scanner.nextLine();

        String response = randomResponse(responses);
        System.out.println("You: " + response);
    }

    public static String randomResponse(String[] responses) {
        int randomIndex = (int) (Math.random() * responses.length);
        return responses[randomIndex];
    }
}
