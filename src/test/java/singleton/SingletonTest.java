package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SingletonTest {
    @Test
    void testSingletonNotNull() {
        Singleton instance = Singleton.getInstance();

        // Ensure instance is not null
        assertNotNull(instance, "Singleton instance should not be null");
    }
}
