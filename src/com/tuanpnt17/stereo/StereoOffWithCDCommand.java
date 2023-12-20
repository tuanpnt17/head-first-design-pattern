/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.stereo;

import com.tuanpnt17.Command;

/**
 *
 * @author TuanPNTSE173039
 */
public class StereoOffWithCDCommand implements Command {

  private Stereo stereo;

  public StereoOffWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    this.stereo.off();
  }

}
