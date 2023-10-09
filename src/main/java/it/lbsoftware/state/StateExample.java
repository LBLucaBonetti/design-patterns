package it.lbsoftware.state;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class StateExample extends DesignPatternExample {

  public static void main(String[] args) {
    new StateExample().showExample();
  }

  @Override
  public void doExample() {
    GumballMachine gumballMachine = new GumballMachine(5);
    log.info(gumballMachine.toString());

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    log.info(gumballMachine.toString());

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    log.info(gumballMachine.toString());

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    log.info(gumballMachine.toString());

    gumballMachine.refill(2);
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    log.info(gumballMachine.toString());

    gumballMachine.insertQuarter();
    gumballMachine.ejectQuarter();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    log.info(gumballMachine.toString());
  }
}
