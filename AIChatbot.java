import java.util.Scanner;

public class AIChatbot {

    public static String getResponse(String message) {
        String input = message.toLowerCase().trim();

        if (input.matches(".*\\b(hi|hello|hey)\\b.*")) {
            return "Hello! Welcome. How can I help you?";
        } else if (input.contains("your name")) {
            return "I'm JavaBot, your virtual assistant.";
        } else if (input.contains("how are you")) {
            return "I'm doing well! Thanks for asking.";
        } else if (input.contains("your purpose")
                || input.contains("what can you do")) {
            return "I can chat with you and answer simple questions.";
        } else if (input.contains("java")) {
            return "Java is a popular, object-oriented programming language.";
        } else if (input.contains("thank")) {
            return "You're welcome! Happy to help.";
        } else if (input.matches(".*\\b(bye|goodbye|exit)\\b.*")) {
            return "Goodbye! Have a wonderful day.";
        } else {
            return "I'm not sure about that yet. Try asking something else!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       Welcome to JavaBot");
        System.out.println("================================");
        System.out.println("Chat with me! Type 'bye' to exit.");

        while (true) {
            System.out.print("\nYou: ");
            String message = scanner.nextLine();

            String response = getResponse(message);
            System.out.println("JavaBot: " + response);

            String input = message.toLowerCase().trim();
            if (input.matches(".*\\b(bye|goodbye|exit)\\b.*")) {
                break;
            }
        }

        scanner.close();
    }
}