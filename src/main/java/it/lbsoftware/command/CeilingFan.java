package it.lbsoftware.command;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
public class CeilingFan {

  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;
  private final String location;
  @Getter private int speed;

  public CeilingFan(final String location) {
    if (location == null || location.isBlank()) {
      throw new IllegalArgumentException("The location cannot be blank");
    }
    this.location = location;
    speed = OFF;
  }

  public void setHigh() {
    speed = HIGH;
    log.info("The " + location + " ceiling fan is set to high");
  }

  public void setMedium() {
    speed = MEDIUM;
    log.info("The " + location + " ceiling fan is set to medium");
  }

  public void setLow() {
    speed = LOW;
    log.info("The " + location + " ceiling fan is set to low");
  }

  public void setOff() {
    speed = OFF;
    log.info("The " + location + " ceiling fan is set to off");
  }
}
