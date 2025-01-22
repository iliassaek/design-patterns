package adapter;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AdapterTest {
    @Test
    void turkey_can_gobble(){
        Turkey turkey = new WildTurkey();
        String gobble = turkey.gobble();
        assertThat(gobble, is("Gobbling ....."));
    }
}
