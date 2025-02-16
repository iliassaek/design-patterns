package state;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatePatternTest {


    @Test
    public void testInitialStateA() {
        // Start with ConcreteStateA.
        Context context = new Context(new ConcreteStateA());
        assertTrue(context.getState() instanceof ConcreteStateA, "Initial state should be ConcreteStateA");
    }


    @Test
    public void testStateTransitionAB() {
        // Start with ConcreteStateA and perform two requests.
        Context context = new Context(new ConcreteStateA());

        // First request: should transition to ConcreteStateB.
        context.request();
        assertThat("After first request, state should be ConcreteStateB", context.getState(), instanceOf(ConcreteStateB.class));
    }

    @Test
    public void testStateTransitionABA() {
        // Start with ConcreteStateA and perform two requests.
        Context context = new Context(new ConcreteStateA());

        // First request: should transition to ConcreteStateB.
        context.request();

        // Second request: should transition to ConcreteStateA
        context.request();

        assertThat("After first request, state should be ConcreteStateA", context.getState(), instanceOf(ConcreteStateA.class));
    }
}
