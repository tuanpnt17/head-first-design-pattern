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
public class Decaf extends Beverage {

  public Decaf() {
    description = "Decaf Coffee";
  }

  @Override
  public double cost() {
    return 1.05;
  }

}
