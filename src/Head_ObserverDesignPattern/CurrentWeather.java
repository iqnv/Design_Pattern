package Head_ObserverDesignPattern;

public class CurrentWeather implements Observer, DisplayElement{
    private float temp;
    private float presure;
    private float humidity;
    private weatherData weatherData;

    public CurrentWeather(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Here is the today's weather condition");
        System.out.println("temp = " + temp + "-- presure = " + presure + "-- humidity = " + humidity);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
      this.temp = temp;
      this.presure = pressure;
      this.humidity = humidity;
      display();
    }
}
