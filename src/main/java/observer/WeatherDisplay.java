package observer;

public class WeatherDisplay implements Observer{
    private float temperature;

    public WeatherDisplay() {
        this.temperature = 0.f;
    }

    public Float display() {
        return temperature;
    }

    @Override
    public void setTemperature(float temp) {
        this.temperature = temp;
    }
}
