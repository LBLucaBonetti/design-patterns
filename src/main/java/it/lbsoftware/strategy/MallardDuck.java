package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class MallardDuck extends Duck {

  public MallardDuck() {
    setFlyBehavior(new FlyWithWings());
    setQuackBehavior(new Quack());
  }

  @Override
  public void display() {
    log.info("I'm a mallard duck");
  }
}
