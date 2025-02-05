package singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.concurrent.*;
import java.util.HashSet;
import java.util.Set;

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


    @Test
    void testSingletonThreadSafety() throws InterruptedException, ExecutionException {
        int threadCount = 100;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        Set<Singleton> instanceSet = ConcurrentHashMap.newKeySet();

        Callable<Singleton> task = Singleton::getInstance;
        Set<Future<Singleton>> futures = new HashSet<>();

        // Submit tasks to get Singleton instance concurrently
        for (int i = 0; i < threadCount; i++) {
            futures.add(executor.submit(task));
        }

        // Collect results
        for (Future<Singleton> future : futures) {
            instanceSet.add(future.get());
        }

        // Shutdown executor
        executor.shutdown();

        // Check if only one instance was created
        assertSame(instanceSet.size(), 1, "Only one Singleton instance should exist.");
    }
}
