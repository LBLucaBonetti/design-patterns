package it.lbsoftware.command;

public class CeilingFanHighCommand implements Command {

  private final CeilingFan ceilingFan;
  private int prevSpeed;

  public CeilingFanHighCommand(final CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.setHigh();
  }

  @Override
  public void undo() {
    switch (prevSpeed) {
      case CeilingFan.HIGH -> ceilingFan.setHigh();
      case CeilingFan.MEDIUM -> ceilingFan.setMedium();
      case CeilingFan.LOW -> ceilingFan.setLow();
      default -> ceilingFan.setOff();
    }
  }
}
