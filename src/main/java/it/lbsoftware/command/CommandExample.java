package it.lbsoftware.command;

import it.lbsoftware.DesignPatternExample;
import java.util.stream.IntStream;
import lombok.extern.java.Log;

@Log
public class CommandExample extends DesignPatternExample {

  public static void main(String[] args) {
    new CommandExample().showExample();
  }

  @Override
  public void doExample() {
    RemoteControl remoteControl = new RemoteControl();
    var livingRoom = new Light("living room");
    var stereo = new Stereo();
    var bathroom = new Light("bathroom");
    var bedroom = new Light("bedroom");
    var livingRoomCeilingFan = new CeilingFan("living room");

    var livingRoomLightOn = new LightOnCommand(livingRoom);
    var livingRoomLightOff = new LightOffCommand(livingRoom);
    var stereoOnWithCd = new StereoOnWithCdCommand(stereo);
    var stereoOff = new StereoOffCommand(stereo);
    var bathroomLightOn = new LightOnCommand(bathroom);
    var bathroomLightOff = new LightOffCommand(bathroom);
    var bedroomLightOn = new LightOnCommand(bedroom);
    var bedroomLightOff = new LightOffCommand(bedroom);
    var livingRoomCeilingFanHigh = new CeilingFanHighCommand(livingRoomCeilingFan);
    var livingRoomCeilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);
    Command[] livingRoomLightOnAndCeilingFanHigh = {livingRoomLightOn, livingRoomCeilingFanHigh};
    Command[] livingRoomLightOffAndCeilingFanOff = {livingRoomLightOff, livingRoomCeilingFanOff};
    var livingRoomLightOnAndCeilingFanHighCommand =
        new MacroCommand(livingRoomLightOnAndCeilingFanHigh);
    var livingRoomLightOffAndCeilingFanOffCommand =
        new MacroCommand(livingRoomLightOffAndCeilingFanOff);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, stereoOnWithCd, stereoOff);
    remoteControl.setCommand(2, bathroomLightOn, bathroomLightOff);
    remoteControl.setCommand(3, bedroomLightOn, bedroomLightOff);
    remoteControl.setCommand(
        4, livingRoomLightOnAndCeilingFanHighCommand, livingRoomLightOffAndCeilingFanOffCommand);

    log.info(remoteControl.toString());
    log.info("--- Executing commands ---");
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.undoButtonWasPushed();
    IntStream.range(1, RemoteControl.COMMANDS)
        .forEach(
            i -> {
              remoteControl.onButtonWasPushed(i);
              remoteControl.offButtonWasPushed(i);
            });
  }
}
