package it.lbsoftware.adapter;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class AdapterExample extends DesignPatternExample {

  public static void main(String[] args) {
    new AdapterExample().showExample();
  }

  private static void testDuck(final Duck duck) {
    duck.quack();
    duck.fly();
  }

  @Override
  public void doExample() {
    Duck duck = new MallardDuck();
    Turkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    log.info("The turkey says...");
    turkey.gobble();
    turkey.fly();

    log.info("The duck says...");
    testDuck(duck);

    log.info("The turkey adapter says...");
    testDuck(turkeyAdapter);
  }
}
