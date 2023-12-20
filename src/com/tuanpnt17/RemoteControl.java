/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

/**
 *
 * @author TuanPNTSE173039
 */
public class RemoteControl {

  private final Command[] onCommand;
  private final Command[] offCommand;

  public RemoteControl() {
    this.onCommand = new Command[7];
    this.offCommand = new Command[7];

    for (int i = 0; i < 7; i++) {
      this.onCommand[i] = new NoCommand();
      this.offCommand[i] = new NoCommand();
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    this.onCommand[slot] = onCommand;
    this.offCommand[slot] = offCommand;
  }

  public void onButtonWasPressed(int slot) {
    this.onCommand[slot].execute();
  }

  public void offButtonWasPressed(int slot) {
    this.offCommand[slot].execute();
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\n-----------------REMOTE CONTROL-----------------\n");
    for (int i = 0; i < onCommand.length; i++) {
      stringBuilder.append("[Slot ").append(i).append("] ")
              .append(onCommand[i].getClass().getName()).append("    ")
              .append(offCommand[i].getClass().getName()).append("\n");
    }
    return stringBuilder.toString();
  }

}
