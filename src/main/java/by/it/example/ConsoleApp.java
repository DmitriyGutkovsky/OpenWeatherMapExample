package by.it.example;

import by.it.example.beans.Weather;
import by.it.example.helpers.TemperatureExtractor;
import by.it.example.helpers.TemperatureFormatter;

public class ConsoleApp {

    private static final String CITY = "Minsk";

    public static void main(String[] args) {

        Weather weather = App.weatherService.getWeather(CITY);
        double celsius = TemperatureExtractor.getCelsius(weather);

        String value = TemperatureFormatter.humanize(celsius, "°C");
        System.out.printf("Temperature in %s %s\n", CITY, value);
    }
}
