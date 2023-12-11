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
public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark Roast coffee";
  }

  @Override
  public double cost() {
    return 0.99;
  }

}
