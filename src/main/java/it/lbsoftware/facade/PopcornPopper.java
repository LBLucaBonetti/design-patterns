package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class PopcornPopper {
  private final String description;

  public PopcornPopper(String description) {
    this.description = description;
  }

  public void on() {
    log.info(description + " on");
  }

  public void off() {
    log.info(description + " off");
  }

  public void pop() {
    log.info(description + " popping popcorn!");
  }

  public String toString() {
    return description;
  }
}
