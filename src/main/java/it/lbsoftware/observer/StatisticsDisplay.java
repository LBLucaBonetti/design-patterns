package it.lbsoftware.observer;

import lombok.extern.java.Log;

@Log
public class StatisticsDisplay implements Observer, DisplayElement {

  private static final float ABS_MAX_TEMP = 100;

  private int numberOfValues;
  private float sumOfValues;
  private float maxTemp;
  private float minTemp;

  public StatisticsDisplay(final WeatherData weatherData) {
    weatherData.registerObserver(this);
    this.maxTemp = -ABS_MAX_TEMP;
    this.minTemp = ABS_MAX_TEMP;
    this.sumOfValues = 0;
    this.numberOfValues = 0;
  }

  @Override
  public void display() {
    final float avgTemp = numberOfValues == 0 ? 0 : sumOfValues / numberOfValues;
    log.info("Avg/Max/Min temp: " + avgTemp + "/" + maxTemp + "/" + minTemp);
  }

  @Override
  public void update(final float temp, final float humidity, final float pressure) {
    updateMax(temp);
    updateMin(temp);
    updateAvg(temp);
    display();
  }

  private void updateMax(final float temp) {
    if (temp > maxTemp) {
      this.maxTemp = temp;
    }
  }

  private void updateMin(final float temp) {
    if (temp < minTemp) {
      this.minTemp = temp;
    }
  }

  private void updateAvg(final float temp) {
    this.numberOfValues++;
    this.sumOfValues += temp;
  }
}
