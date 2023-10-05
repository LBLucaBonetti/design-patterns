package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class TheaterLights {
  private final String description;

  public TheaterLights(String description) {
    this.description = description;
  }

  public void on() {
    log.info(description + " on");
  }

  public void off() {
    log.info(description + " off");
  }

  public void dim(int level) {
    log.info(description + " dimming to " + level + "%");
  }

  public String toString() {
    return description;
  }
}
