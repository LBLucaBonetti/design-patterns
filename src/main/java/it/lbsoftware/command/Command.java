package it.lbsoftware.command;

public interface Command {

  void execute();

  void undo();
}
