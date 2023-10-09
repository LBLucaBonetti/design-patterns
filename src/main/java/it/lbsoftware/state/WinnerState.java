package it.lbsoftware.state;

import lombok.extern.java.Log;

@Log
public class WinnerState implements State {

  private final GumballMachine gumballMachine;

  public WinnerState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    log.info("You cannot insert another quarter at this time");
  }

  @Override
  public void ejectQuarter() {
    log.info("You cannot eject you quarter while winning");
  }

  @Override
  public void turnCrank() {
    log.info("You turn the crank but nothing happens");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      log.info("YOU ARE A WINNER! You got two gumballs for your quarter");
      if (gumballMachine.getCount() > 0) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else {
        log.info("Ooops, out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }
    }
  }

  @Override
  public void refill() {
    // Nothing to do
  }

  @Override
  public String toString() {
    return "winner";
  }
}
