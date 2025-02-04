package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {
    @Test
    void testSingletonNotNull() {
        Singleton instance = Singleton.getInstance();

        // Ensure instance is not null
        assertNotNull(instance, "Singleton instance should not be null");
    }

    @Test
    void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Ensure both instances are the same
        assertSame(instance1, instance2, "Instances should be the same");
    }
}
