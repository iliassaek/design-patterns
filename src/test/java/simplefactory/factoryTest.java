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

    @Test
    void cheese_pizza_has_the_right_type(){
        Pizza pizza = ProductFactory.createPizza("Cheese");
        assertThat(pizza.getType(),is("cheese and a lot of mozzarilla"));
    }
}
