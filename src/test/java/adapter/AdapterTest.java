package adapter;

import org.junit.jupiter.api.Test;

import static adapter.Constants.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AdapterTest {
    @Test
    void turkey_can_gobble(){
        Turkey turkey = new WildTurkey();
        String gobble = turkey.gobble();
        assertThat(gobble, is(GOBBLING));
    }

    @Test
    void turkey_fly_short_distance(){
        Turkey turkey = new WildTurkey();
        String fly = turkey.fly();
        assertThat(fly, is(TURKEY_FLY_SHORT));
    }

    @Test
    void turkey_can_quack(){
        Duck turkeyAdapter = new TurkeyAdapter();
        String quack = turkeyAdapter.quack();
        assertThat(quack, is(GOBBLING));
    }

    @Test
    void turkey_can_fly_long_distance(){
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter();
        String fly = turkeyAdapter.fly();
        assertThat(fly, is(TURKEY_FLY_LONG));
    }
}
