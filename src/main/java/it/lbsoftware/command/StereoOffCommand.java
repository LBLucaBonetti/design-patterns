package it.lbsoftware.command;

public class StereoOffCommand implements Command {

  private final Stereo stereo;

  public StereoOffCommand(final Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
  }
}
