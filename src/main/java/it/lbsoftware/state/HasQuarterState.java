package it.lbsoftware.state;

import java.util.Random;
import lombok.extern.java.Log;

@Log
public class HasQuarterState implements State {

  private final GumballMachine gumballMachine;
  private final Random randomWinner;

  public HasQuarterState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
    this.randomWinner = new Random(System.currentTimeMillis());
  }

  @Override
  public void insertQuarter() {
    log.info("You cannot insert another quarter");
  }

  @Override
  public void ejectQuarter() {
    log.info("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    log.info("You turned...");
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    log.info("No gumball dispensed");
  }

  @Override
  public void refill() {
    // Nothing to do
  }

  @Override
  public String toString() {
    return "has quarter";
  }
}
