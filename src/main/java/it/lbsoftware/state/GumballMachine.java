package it.lbsoftware.state;

import lombok.Getter;
import lombok.extern.java.Log;

@Log
public class GumballMachine {

  @Getter private final State soldOutState;
  @Getter private final State noQuarterState;
  @Getter private final State hasQuarterState;
  @Getter private final State soldState;
  @Getter private final State winnerState;

  private State state;
  @Getter private int count;

  public GumballMachine(final int numberOfGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = numberOfGumballs;
    if (numberOfGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void setState(final State state) {
    this.state = state;
  }

  public void releaseBall() {
    log.info("A gumball comes rolling out the slot...");
    if (count > 0) {
      count--;
    }
  }

  public void refill(final int count) {
    this.count += count;
    log.info("The gumball machine was just refilled; its new count is: " + this.count);
    state.refill();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(System.lineSeparator());
    result.append("Mighty Gumball, Inc.");
    result.append(System.lineSeparator());
    result.append("Inventory: ").append(count).append(" gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append(System.lineSeparator());
    result.append("Machine is ").append(state);
    result.append(System.lineSeparator());
    return result.toString();
  }
}
