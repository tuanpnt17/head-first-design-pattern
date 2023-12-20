/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.Command;
import com.tuanpnt17.light.LightOffCommand;
import com.tuanpnt17.light.LightOnCommand;
import com.tuanpnt17.light.Light;
import com.tuanpnt17.RemoteControl;
import com.tuanpnt17.garage.GarageDoor;
import com.tuanpnt17.garage.GarageDoorCloseCommand;
import com.tuanpnt17.garage.GarageDoorOpenCommand;
import com.tuanpnt17.stereo.Stereo;
import com.tuanpnt17.stereo.StereoOffWithCDCommand;
import com.tuanpnt17.stereo.StereoOnWithCDCommand;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();
    Light livingRoomLight = new Light("living room");
    Light kitchenLight = new Light("kitchen");
    Light bathroomLight = new Light("bathroom");
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo();

    Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
    Command kitchenLightOn = new LightOnCommand(kitchenLight);
    Command bathroomLightOn = new LightOnCommand(bathroomLight);
    Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
    Command stereoOn = new StereoOnWithCDCommand(stereo);

    Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
    Command kitchenLightOff = new LightOffCommand(kitchenLight);
    Command bathroomLightOff = new LightOffCommand(bathroomLight);
    Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);
    Command stereoOff = new StereoOffWithCDCommand(stereo);

    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remote.setCommand(1, kitchenLightOn, kitchenLightOff);
    remote.setCommand(2, bathroomLightOn, bathroomLightOff);
    remote.setCommand(3, garageDoorOpen, garageDoorClose);
    remote.setCommand(4, stereoOn, stereoOff);

    System.out.println(remote);
    System.out.println();
    remote.onButtonWasPressed(2);
    remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(2);
  }
}
