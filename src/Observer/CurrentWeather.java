package Observer;

public class CurrentWeather implements Observer, Display {
    private Float temperature;
    private Float humidity;
    private Float pressure;
    private Subject subject;

    public CurrentWeather(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        displayCurrentWeather();
    }

    private void displayCurrentWeather() {
        System.out.println(String.format("Current Weather: \n" +
                "Temperature: %.1f \n" +
                "Humidity: %.0f \n" +
                "Pressure: %.0f \n", temperature, humidity, pressure));
    }
}
