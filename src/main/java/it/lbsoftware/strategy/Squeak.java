package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    log.info("Squeak");
  }
}
