package strategy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MallardDuckTest {
    @Test
    void malardduck_can_quack(){
        Duck mallardDuck = new MallardDuck();
        String quack = mallardDuck.quack();
        assertThat(quack,is(MallardDuck.QUACK_QUACK) );
    }

    @Test
    void malardduck_can_fly(){
        Duck mallardDuck = new MallardDuck();
        String fly = mallardDuck.fly();
        assertThat(fly, is(MallardDuck.FLY_FLY));
    }
}