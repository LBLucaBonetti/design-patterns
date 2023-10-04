package it.lbsoftware.command;

import lombok.extern.java.Log;

@Log
public class Light {

  private final String location;

  public Light(final String location) {
    if (location == null || location.isBlank()) {
      throw new IllegalArgumentException("The location cannot be blank");
    }
    this.location = location;
  }

  public void on() {
    log.info("The " + location + " light turns on");
  }

  public void off() {
    log.info("The " + location + " light turns off");
  }
}
