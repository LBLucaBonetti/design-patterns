package it.lbsoftware.command;

public class NoCommand implements Command {

  @Override
  public void execute() {
    // This command does nothing
  }

  @Override
  public void undo() {
    // This command does nothing
  }
}
