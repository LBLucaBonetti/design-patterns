package it.lbsoftware.command;

public class CeilingFanOffCommand implements Command {

  private final CeilingFan ceilingFan;
  private int prevSpeed;

  public CeilingFanOffCommand(final CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.setOff();
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
