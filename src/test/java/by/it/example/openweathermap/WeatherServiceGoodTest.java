package by.it.example.openweathermap;

import by.it.example.beans.Weather;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherServiceGoodTest {


    @Test
    public void getWeather() {
        WeatherClient client = Mocks.createMock(Data.CITY, Data.TEMPERATURE);
        WeatherService service = new WeatherService(client);
        Weather weather = service.getWeather("Minsk");
        double temperature = weather.getTemperature();
        assertEquals(Data.TEMPERATURE, temperature, 1e-10);
    }
}