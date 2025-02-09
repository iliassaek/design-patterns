package simplefactory;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static simplefactory.Constants.*;

public class FactoryTest {

    @Test
    void test_cheese_pizza(){
        Pizza pizza = ProductFactory.createPizza(CHEESE_TYPE);
        assertThat(pizza, is(notNullValue()));
    }

    @Test
    void cheese_pizza_has_the_right_type(){
        Pizza pizza = ProductFactory.createPizza(CHEESE_TYPE);
        assertThat(pizza.getDescription(),is(CHEESE_DESCRIPTION));
    }

    @Test
    void vegetarian_pizza_has_the_right_type(){
        Pizza pizza = ProductFactory.createPizza(VEGETARIAN_TYPE);
        assertThat(pizza.getDescription(), is(VEGETARIAN_DESCRIPTION));

    }
}
