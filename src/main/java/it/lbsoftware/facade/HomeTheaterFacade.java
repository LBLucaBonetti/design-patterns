package it.lbsoftware.facade;

import lombok.extern.java.Log;

@Log
public class HomeTheaterFacade {

  private final Amplifier amp;
  private final Tuner tuner;
  private final StreamingPlayer player;
  private final Projector projector;
  private final Screen screen;
  private final TheaterLights lights;
  private final PopcornPopper popper;

  public HomeTheaterFacade(
      Amplifier amp,
      Tuner tuner,
      StreamingPlayer player,
      Projector projector,
      Screen screen,
      TheaterLights lights,
      PopcornPopper popper) {

    this.amp = amp;
    this.tuner = tuner;
    this.player = player;
    this.projector = projector;
    this.screen = screen;
    this.lights = lights;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    log.info("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setStreamingPlayer(player);
    amp.setSurroundSound();
    amp.setVolume(5);
    player.on();
    player.play(movie);
  }

  public void endMovie() {
    log.info("Shutting movie theater down...");
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    player.stop();
    player.off();
  }

  public void listenToRadio(double frequency) {
    log.info("Tuning in the airwaves...");
    tuner.on();
    tuner.setFrequency(frequency);
    amp.on();
    amp.setVolume(5);
    amp.setTuner(tuner);
  }

  public void endRadio() {
    log.info("Shutting down the tuner...");
    tuner.off();
    amp.off();
  }
}
