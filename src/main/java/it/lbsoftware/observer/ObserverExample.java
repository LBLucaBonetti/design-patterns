package it.lbsoftware.observer;

import it.lbsoftware.DesignPatternExample;

public class ObserverExample extends DesignPatternExample {
  public static void main(String[] args) {
    new ObserverExample().showExample();
  }

  @Override
  public void doExample() {
    WeatherData weatherData = new WeatherData();

    new CurrentConditionsDisplay(weatherData);
    new StatisticsDisplay(weatherData);
    new ForecastDisplay(weatherData);

    weatherData.setMeasurements(30, 65, 30.4f);
    weatherData.setMeasurements(32, 70, 29.2f);
    weatherData.setMeasurements(28, 90, 29.2f);
  }
}
