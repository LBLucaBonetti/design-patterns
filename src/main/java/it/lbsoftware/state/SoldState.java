package it.lbsoftware.state;

import lombok.extern.java.Log;

@Log
public class SoldState implements State {

  private final GumballMachine gumballMachine;

  public SoldState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    log.info("Please wait, we are already giving you a gumball");
  }

  @Override
  public void ejectQuarter() {
    log.info("Sorry, you already turned the crank");
  }

  @Override
  public void turnCrank() {
    log.info("Turning twice does not get you another gumball");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      log.info("Ooops, out of gumballs");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }

  @Override
  public void refill() {
    // Nothing to do
  }

  @Override
  public String toString() {
    return "sold";
  }
}
