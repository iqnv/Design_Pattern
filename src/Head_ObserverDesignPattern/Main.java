package Head_ObserverDesignPattern;

import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String args[]) {

        weatherData weatherData = new weatherData();
        CurrentWeather currentWeather = new CurrentWeather(weatherData);

        weatherData.setWeatherData(11, 12,12);
    }
}
