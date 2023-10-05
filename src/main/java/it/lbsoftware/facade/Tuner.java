package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class Tuner {
  private final String description;

  public Tuner(String description) {
    this.description = description;
  }

  public void on() {
    log.info(description + " on");
  }

  public void off() {
    log.info(description + " off");
  }

  public void setFrequency(double frequency) {
    log.info(description + " setting frequency to " + frequency);
  }

  public String toString() {
    return description;
  }
}
