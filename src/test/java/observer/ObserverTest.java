package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class ObserverTest {
    private WeatherStation weatherStation;
    private WeatherDisplay display1;
    private WeatherDisplay display2;

    @BeforeEach
    void setUp() {
        weatherStation = new WeatherStation();
        display1 = new WeatherDisplay();
        display2 = new WeatherDisplay();
    }
    @Test
    void test(){
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setTemperature(25.f);
        assertThat(display1.getTemperature(), is(25.f));
        assertThat(display2.getTemperature(), is(25.f));
    }
}
