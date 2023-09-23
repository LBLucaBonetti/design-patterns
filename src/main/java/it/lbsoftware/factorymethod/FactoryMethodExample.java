package it.lbsoftware.factorymethod;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class FactoryMethodExample extends DesignPatternExample {

  public static void main(String[] args) {
    new FactoryMethodExample().showExample();
  }

  @Override
  public void doExample() {
    PizzaStore modenese = new ModenesePizzaStore();
    PizzaStore neapolitan = new NeapolitanPizzaStore();

    Pizza northernPizza = modenese.orderPizza("parmesan");
    log.info("A modenese guy ordered a " + northernPizza.getName());

    Pizza southernPizza = neapolitan.orderPizza("marinara");
    log.info("A neapolitan guy ordered a " + southernPizza.getName());
  }
}
