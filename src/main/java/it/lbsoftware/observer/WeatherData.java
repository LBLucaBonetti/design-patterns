package it.lbsoftware.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private final List<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(o -> o.update(temp, humidity, pressure));
  }

  public void measurementChanged() {
    notifyObservers();
  }

  public void setMeasurements(final float temp, final float humidity, final float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementChanged();
  }
}
