package Head_DecoratorPattern;

import Head_ObserverDesignPattern.CurrentWeather;
import Head_ObserverDesignPattern.weatherData;

public class Main {
    public static void main(String args[]) {

        Bevarage bevarage = new Discount(new addMilk(new Blend(new Espreso("Espreso"))));
        System.out.println(bevarage.cost());
    }
}
