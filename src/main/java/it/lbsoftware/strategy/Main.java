package it.lbsoftware.strategy;

import lombok.extern.java.Log;

@Log
public class Main {

  public static void main(String[] args) {
    System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
    Duck mallard = new MallardDuck();
    performActions(mallard);

    Duck model = new ModelDuck();
    performActions(model);
    model.setFlyBehavior(new FlyRocketPowered());
    model.setQuackBehavior(new Squeak());
    performActions(model);
  }

  private static void performActions(final Duck duck) {
    log.info("---");
    duck.display();
    duck.swim();
    duck.performQuack();
    duck.performFly();
    log.info("---");
  }
}
