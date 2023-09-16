package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public abstract class Duck {

  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  protected Duck() {}

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    log.info("All ducks float, even decoys!");
  }

  public abstract void display();

  public void setFlyBehavior(final FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(final QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
