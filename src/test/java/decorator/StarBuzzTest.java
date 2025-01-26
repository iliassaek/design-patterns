package decorator;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StarBuzzTest {
    @Test
    void test(){
        Mocha mocha = new Mocha();
        assertThat(mocha.cost(), is(0.5));
    }
}
