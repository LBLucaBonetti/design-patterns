package it.lbsoftware.command;

public class LightOnCommand implements Command {

  private final Light light;

  public LightOnCommand(final Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }

  @Override
  public void undo() {
    light.off();
  }
}
