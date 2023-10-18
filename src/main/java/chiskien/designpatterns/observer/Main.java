package chiskien.designpatterns.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurement(70, 60, 20.3f);
        weatherData.setMeasurement(880, 620, 30.3f);
        weatherData.setMeasurement(9990, 1232, 30.3f);


    }
}
