package it.lbsoftware.observer;

import lombok.extern.java.Log;

@Log
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temp;
  private float humidity;

  public CurrentConditionsDisplay(final WeatherData weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    log.info("Current conditions: temp " + temp + ", humidity " + humidity);
  }

  @Override
  public void update(final float temp, final float humidity, final float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    display();
  }
}
