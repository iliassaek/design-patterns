package decorator;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StarBuzzTest {
    @Test
    void espresso_has_the_right_price(){
        Beverage espresso = new Espresso();
        assertThat(espresso.cost(),is(Constants.ESPRESSO_PRICE));
    }

    @Test
    void espresso_with_mocha_has_the_right_price(){
        Beverage espresso = new Espresso();
        Beverage cup = new Mocha(espresso);
        assertThat(cup.cost(), is(1.5));
    }

    @Test
    void espresso_with_milk_have_the_right_price(){
        Beverage espresso = new Espresso();
        Beverage cup = new Milk(espresso);
        assertThat(cup.cost(), is(2.));
    }

}
