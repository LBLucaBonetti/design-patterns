package it.lbsoftware.observer;

import lombok.extern.java.Log;

@Log
public class ForecastDisplay implements Observer, DisplayElement {

  private float currentPressure;
  private float previousPressure;

  public ForecastDisplay(final WeatherData weatherData) {
    weatherData.registerObserver(this);
    currentPressure = 0;
    previousPressure = 0;
  }

  @Override
  public void display() {
    if (this.currentPressure > this.previousPressure) {
      log.info("Pressure is becoming high");
    } else if (this.currentPressure < this.previousPressure) {
      log.info("Pressure is becoming low");
    } else {
      log.info("Pressure is stable");
    }
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.previousPressure = this.currentPressure;
    this.currentPressure = pressure;
    display();
  }
}
