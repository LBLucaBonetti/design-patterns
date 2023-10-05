package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class Amplifier {
  private final String description;

  public Amplifier(String description) {
    this.description = description;
  }

  public void on() {
    log.info(description + " on");
  }

  public void off() {
    log.info(description + " off");
  }

  public void setSurroundSound() {
    log.info(description + " surround sound on (5 speakers, 1 subwoofer)");
  }

  public void setVolume(int level) {
    log.info(description + " setting volume to " + level);
  }

  public void setTuner(Tuner tuner) {
    log.info(description + " setting tuner to " + tuner);
  }

  public void setStreamingPlayer(StreamingPlayer player) {
    log.info(description + " setting Streaming player to " + player);
  }

  public String toString() {
    return description;
  }
}
