package it.lbsoftware.abstractfactory;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class AbstractFactoryExample extends DesignPatternExample {

  public static void main(String[] args) {
    new AbstractFactoryExample().showExample();
  }

  @Override
  public void doExample() {
    PizzaStore modenese = new ModenesePizzaStore();
    PizzaStore neapolitan = new NeapolitanPizzaStore();

    log.info(modenese.orderPizza("margherita").toString());
    log.info(neapolitan.orderPizza("margherita").toString());
    log.info(modenese.orderPizza("anchovies").toString());
    log.info(neapolitan.orderPizza("anchovies").toString());
    log.info(modenese.orderPizza("ham").toString());
    log.info(neapolitan.orderPizza("ham").toString());
    log.info(modenese.orderPizza("a simple blank one").toString());
    log.info(neapolitan.orderPizza("a simple blank one").toString());
  }
}
