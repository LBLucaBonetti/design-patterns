package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class ModelDuck extends Duck {
  public ModelDuck() {
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new Quack());
  }

  @Override
  public void display() {
    log.info("I'm a model duck");
  }
}
