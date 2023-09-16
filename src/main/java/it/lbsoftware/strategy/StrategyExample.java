package it.lbsoftware.strategy;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class StrategyExample extends DesignPatternExample {

  public static void main(String[] args) {
    new StrategyExample().showExample();
  }

  private static void performActions(final Duck duck) {
    log.info("---");
    duck.display();
    duck.swim();
    duck.performQuack();
    duck.performFly();
    log.info("---");
  }

  @Override
  public void doExample() {
    Duck mallard = new MallardDuck();
    performActions(mallard);

    Duck model = new ModelDuck();
    performActions(model);
    model.setFlyBehavior(new FlyRocketPowered());
    model.setQuackBehavior(new Squeak());
    performActions(model);
  }
}
