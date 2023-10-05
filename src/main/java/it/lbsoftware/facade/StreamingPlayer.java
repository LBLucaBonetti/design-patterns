package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class StreamingPlayer {
  private final String description;
  private String movie;

  public StreamingPlayer(String description) {
    this.description = description;
  }

  public void on() {
    log.info(description + " on");
  }

  public void off() {
    log.info(description + " off");
  }

  public void play(String movie) {
    this.movie = movie;
    log.info(description + " playing \"" + movie + "\"");
  }

  public void stop() {
    log.info(description + " stopped \"" + movie + "\"");
  }

  public String toString() {
    return description;
  }
}
