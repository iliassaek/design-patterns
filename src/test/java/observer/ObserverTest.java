package observer;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class ObserverTest {

    @Test
    void test(){
        assertThat(5,is(5));
    }
}
