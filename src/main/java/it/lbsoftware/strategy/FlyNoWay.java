package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    log.info("I can't fly");
  }
}
