/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.component;

import com.tuanpnt17.core.Beverage;

/**
 *
 * @author TuanPNTSE173039
 */
public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend coffe";
  }

  @Override
  public double cost() {
    return 0.89;
  }

}
