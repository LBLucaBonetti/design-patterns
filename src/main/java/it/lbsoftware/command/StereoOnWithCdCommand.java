package it.lbsoftware.command;

public class StereoOnWithCdCommand implements Command {
  private final Stereo stereo;

  public StereoOnWithCdCommand(final Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCd();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }
}
