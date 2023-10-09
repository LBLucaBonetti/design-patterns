package it.lbsoftware.state;

import lombok.extern.java.Log;

@Log
public class NoQuarterState implements State {

  private final GumballMachine gumballMachine;

  public NoQuarterState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    log.info("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    log.info("You have not inserted a quarter");
  }

  @Override
  public void turnCrank() {
    log.info("You turned, but there is no quarter");
  }

  @Override
  public void dispense() {
    log.info("You need to pay first");
  }

  @Override
  public void refill() {
    // Nothing to do
  }

  @Override
  public String toString() {
    return "no quarter";
  }
}
