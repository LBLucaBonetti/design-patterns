package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class Screen {
  private final String description;

  public Screen(String description) {
    this.description = description;
  }

  public void up() {
    log.info(description + " going up");
  }

  public void down() {
    log.info(description + " going down");
  }

  public String toString() {
    return description;
  }
}
