package org.chiskien.designpatterns.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private final WeatherData weatherData;
    private float lastPressure;
    private float currentPressure = 29.3f;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecasting Station: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for the cooler, rainy weather");
        } else {
            System.out.println("More of the same");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
