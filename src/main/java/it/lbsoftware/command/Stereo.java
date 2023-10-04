package it.lbsoftware.command;

import lombok.extern.java.Log;

@Log
public class Stereo {

  private static final int MAX_VOLUME = 10;

  public void on() {
    log.info("The stereo turns on");
  }

  public void off() {
    log.info("The stereo turns off");
  }

  public void setCd() {
    log.info("The stereo is set to cd");
  }

  public void setVolume(final int newVolume) {
    if (newVolume >= MAX_VOLUME) {
      log.info("The volume of the stereo is set to its max");
    } else if (newVolume <= 0) {
      log.info("The volume of the stereo is set to its min");
    } else {
      log.info("The volume of the stereo is set to " + newVolume);
    }
  }
}
