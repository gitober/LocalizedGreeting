import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizedGreeting {

    public static void main(String[] args) {
        // Prompt user to select a language
        System.out.println("Select a language: ");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Farsi");
        System.out.println("5. Japanese");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Set the locale based on user's choice
        Locale locale = switch (choice) {
            case 1 -> Locale.of("en", "US");  // Use Locale.of() for English
            case 2 -> Locale.of("fr", "FR");  // Use Locale.of() for French
            case 3 -> Locale.of("es", "ES");  // Use Locale.of() for Spanish
            case 4 -> Locale.of("fa", "IR");  // Use Locale.of() for Farsi
            case 5 -> Locale.of("ja", "JP");  // Use Locale.of() for Japanese
            default -> {
                System.out.println("Invalid choice. Defaulting to English.");
                yield Locale.of("en", "US");  // Use Locale.of() as a default
            }
        };

        // Load the resource bundle for the selected locale
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        // Display the localized greeting message
        System.out.println(messages.getString("greeting"));

        scanner.close();
    }
}
