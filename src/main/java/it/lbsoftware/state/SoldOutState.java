package it.lbsoftware.state;

import lombok.extern.java.Log;

@Log
public class SoldOutState implements State {

  private final GumballMachine gumballMachine;

  public SoldOutState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    log.info("You cannot insert a quarter, the gumball machine is sold out");
  }

  @Override
  public void ejectQuarter() {
    log.info("You did not insert a quarter, you cannot eject");
  }

  @Override
  public void turnCrank() {
    log.info("You turned but there are no gumballs");
  }

  @Override
  public void dispense() {
    log.info("No gumball dispensed");
  }

  @Override
  public void refill() {
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public String toString() {
    return "sold out";
  }
}
