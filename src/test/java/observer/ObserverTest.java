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
    void observers_are_notified(){
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setTemperature(25.f);
        assertThat(display1.display(), is(25.f));
        assertThat(display2.display(), is(25.f));
    }

    @Test
    void old_value_when_unsubscribed(){
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setTemperature(25.f);
        weatherStation.removeObserver(display1);
        weatherStation.setTemperature(26.f);

        assertThat(display1.display(), is(25.f));
        assertThat(display2.display(), is(26.f));
    }
}
