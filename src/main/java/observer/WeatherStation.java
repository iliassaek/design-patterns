package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays;

    public WeatherStation() {
        displays = new ArrayList<>();
    }

    public void addObserver(WeatherDisplay display) {
        displays.add(display);
    }

    public void setTemperature(float v) {
        for (WeatherDisplay d : displays){
            d.setTemperature(v);
        }
    }

    public void removeObserver(WeatherDisplay display){
        displays.remove(display);
    }
}
