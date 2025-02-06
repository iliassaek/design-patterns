package simplefactory;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class factoryTest {

    @Test
    void test_cheese_pizza(){
        Pizza pizza = ProductFactory.createPizza("Cheese");
        assertThat(pizza, is(notNullValue()));
    }
}
