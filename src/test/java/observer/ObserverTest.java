package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static observer.Constants.COLD_TEMPERATURE;
import static observer.Constants.HOT_TEMPERATURE;
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
        weatherStation.setTemperature(COLD_TEMPERATURE);

        assertThat(display1.display(), is(COLD_TEMPERATURE));
        assertThat(display2.display(), is(COLD_TEMPERATURE));
    }

    @Test
    void old_value_when_unsubscribed(){
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.setTemperature(COLD_TEMPERATURE);

        weatherStation.removeObserver(display1);
        weatherStation.setTemperature(HOT_TEMPERATURE);

        assertThat(display1.display(), is(COLD_TEMPERATURE));
        assertThat(display2.display(), is(HOT_TEMPERATURE));
    }
}
