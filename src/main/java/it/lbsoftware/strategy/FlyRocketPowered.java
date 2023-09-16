package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    log.info("I'm flying with a rocket!");
  }
}
