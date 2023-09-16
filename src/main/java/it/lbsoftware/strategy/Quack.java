package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    log.info("Quack");
  }
}
