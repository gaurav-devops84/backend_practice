import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YourClassTest {

    @Test
    void testGreet() {
        YourClass yourClass = new YourClass();
        String expectedGreeting = "Hello, World!";
        String actualGreeting = yourClass.greet("World");

        assertEquals(expectedGreeting, actualGreeting);
    }
}