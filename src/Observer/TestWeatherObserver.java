package Observer;

public class TestWeatherObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentWeather currentWeather = new CurrentWeather(weatherData);

        weatherData.setAllParameters(25.3f,13f,3.993f);

    }
}
