package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class Projector {
  private final String description;

  public Projector(String description) {
    this.description = description;
  }

  public void on() {
    log.info(description + " on");
  }

  public void off() {
    log.info(description + " off");
  }

  public void wideScreenMode() {
    log.info(description + " in widescreen mode (16x9 aspect ratio)");
  }

  public String toString() {
    return description;
  }
}
