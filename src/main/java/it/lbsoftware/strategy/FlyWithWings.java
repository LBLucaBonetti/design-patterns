package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    log.info("I'm flying");
  }
}
