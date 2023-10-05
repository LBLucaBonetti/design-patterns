package it.lbsoftware.facade;

import it.lbsoftware.DesignPatternExample;

public class FacadeExample extends DesignPatternExample {

  public static void main(String[] args) {
    new FacadeExample().showExample();
  }

  @Override
  public void doExample() {
    Amplifier amp = new Amplifier("Amplifier");
    Tuner tuner = new Tuner("AM/FM tuner");
    StreamingPlayer player = new StreamingPlayer("Streaming player");
    Projector projector = new Projector("Projector");
    TheaterLights lights = new TheaterLights("Theater ceiling lights");
    Screen screen = new Screen("Theater screen");
    PopcornPopper popper = new PopcornPopper("Popcorn popper");

    HomeTheaterFacade homeTheater =
        new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();

    homeTheater.listenToRadio(88.8);
    homeTheater.endRadio();
  }
}
