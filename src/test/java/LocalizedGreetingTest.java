import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalizedGreetingTest {

    private ResourceBundle messages;

    @BeforeEach
    public void setup() {
        // No specific locale setup required for this test
    }

    @Test
    public void testEnglishGreeting() {
        Locale locale = Locale.of("en", "US");  // Use Locale.of() instead of the constructor
        messages = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("Hello! Welcome to our application.", messages.getString("greeting"));
    }

    @Test
    public void testFrenchGreeting() {
        Locale locale = Locale.of("fr", "FR");  // Use Locale.of() instead of the constructor
        messages = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("Bonjour! Bienvenue dans notre application.", messages.getString("greeting"));
    }

    @Test
    public void testSpanishGreeting() {
        Locale locale = Locale.of("es", "ES");  // Use Locale.of() instead of the constructor
        messages = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("¡Hola! Bienvenido a nuestra aplicación.", messages.getString("greeting"));
    }
}
