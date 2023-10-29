package chiskien.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degree and " +
                humidity + "% humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

}
