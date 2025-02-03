package observer;

import static observer.Constants.ZERO_TEMPERATURE;

public class WeatherDisplay implements Observer{
    private float temperature;

    public WeatherDisplay() {
        this.temperature = ZERO_TEMPERATURE;
    }

    public Float display() {
        return temperature;
    }

    @Override
    public void setTemperature(float temp) {
        this.temperature = temp;
    }
}
