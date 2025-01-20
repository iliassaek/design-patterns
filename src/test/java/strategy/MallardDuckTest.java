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

    @Test
    void redHeadDuck_can_quack() {
        Duck duck = new RedHeadDuck();
        String quack = duck.quack();
        assertThat(quack, is(RedHeadDuck.QUACK_QUACK));
    }

    @Test
    void redHeadDuck_can_fly() {
        Duck duck = new RedHeadDuck();
        String fly= duck.fly();
        assertThat(fly, is("default fly behavior: fly fly"));
    }

    @Test
    void redHeadDuck_can_fly_with_jetpack(){
        Duck duck = new RedHeadDuck(new JetPack());
        String fly = duck.fly();
        assertThat(fly, is("Flying with jet pack voooof"));
    }
}