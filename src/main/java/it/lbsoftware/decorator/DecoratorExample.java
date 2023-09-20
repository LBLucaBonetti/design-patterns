package it.lbsoftware.decorator;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class DecoratorExample extends DesignPatternExample {

  public static void main(String[] args) {
    new DecoratorExample().showExample();
  }

  private static void showDescriptionAndCost(final Beverage beverage) {
    log.info(beverage.getDescription() + " " + beverage.cost() + "€");
  }

  @Override
  public void doExample() {
    Beverage beverage1 = new Espresso();
    showDescriptionAndCost(beverage1);

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    showDescriptionAndCost(beverage2);

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    showDescriptionAndCost(beverage3);
  }
}
