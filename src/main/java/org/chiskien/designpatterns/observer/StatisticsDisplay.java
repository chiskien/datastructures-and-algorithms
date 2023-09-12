package org.chiskien.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements DisplayElement, Observer {
    private final WeatherData weatherData;
    private final List<Float> temperatureHistory;
    private float min = Float.MAX_VALUE;
    private float max = Float.MIN_VALUE;
    private float average;

    public StatisticsDisplay(WeatherData weatherData) {
        temperatureHistory = new ArrayList<>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public float getMin() {
        for (float temp : temperatureHistory) {
            min = Math.min(min, temp);
        }
        return min;
    }

    public float getAverage() {
        float sum = 0.0f;
        for (float temp : temperatureHistory) {
            sum += temp;
        }
        return sum / temperatureHistory.size();
    }

    public float getMax() {
        for (float temp : temperatureHistory) {
            max = Math.max(max, temp);
        }
        return max;
    }

    @Override
    public void display() {
        System.out.println("AVG/MAX/MIN temperature: " + getAverage() + "/" + getMax() + "/" + getMin());
    }

    @Override
    public void update() {
        temperatureHistory.add(weatherData.getTemperature());
        display();
    }
}
