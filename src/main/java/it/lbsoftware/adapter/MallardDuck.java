package it.lbsoftware.adapter;

import lombok.extern.java.Log;

@Log
public class MallardDuck implements Duck {

  @Override
  public void quack() {
    log.info("Quack");
  }

  @Override
  public void fly() {
    log.info("I'm flying");
  }
}
