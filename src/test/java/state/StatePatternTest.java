package state;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatePatternTest {


    @Test
    public void testInitialState() {
        // Start with ConcreteStateA.
        Context context = new Context(new ConcreteStateA());
        assertTrue(context.getState() instanceof ConcreteStateA,
                "Initial state should be ConcreteStateA");
    }
}
