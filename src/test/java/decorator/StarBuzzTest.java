package decorator;

import org.junit.jupiter.api.Test;

import static decorator.Constants.MOCHA_PRICE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StarBuzzTest {
    @Test
    void mocha_has_the_right_price(){
        Mocha mocha = new Mocha();
        assertThat(mocha.cost(), is(MOCHA_PRICE));
    }

    @Test
    void espresso_has_the_right_price(){
        Beverage espresso = new Espresso();
        assertThat(espresso.cost(),is(1.));
    }

}
