package it.lbsoftware.command;

import java.util.stream.IntStream;

public class RemoteControl {
  public static final int COMMANDS = 5;
  private final Command[] onCommands;
  private final Command[] offCommands;
  private Command undoCommand;

  public RemoteControl() {
    this.onCommands = new Command[COMMANDS];
    this.offCommands = new Command[COMMANDS];
    final Command noCommand = new NoCommand();
    IntStream.range(0, COMMANDS)
        .forEach(
            i -> {
              onCommands[i] = noCommand;
              offCommands[i] = noCommand;
            });
    undoCommand = noCommand;
  }

  public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
    if (slot >= COMMANDS) {
      throw new IllegalArgumentException(
          "The remote has only " + COMMANDS + " commands from 0 to " + (COMMANDS - 1));
    }
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(final int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(final int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("--- Remote control ---");
    stringBuilder.append(System.lineSeparator());
    IntStream.range(0, COMMANDS)
        .forEach(
            i ->
                stringBuilder
                    .append("slot[")
                    .append(i)
                    .append("] ON=")
                    .append(onCommands[i].getClass().getName())
                    .append(" OFF=")
                    .append(offCommands[i].getClass().getName())
                    .append(System.lineSeparator()));
    stringBuilder.append("undo=").append(undoCommand.getClass().getName());
    return stringBuilder.toString();
  }
}
