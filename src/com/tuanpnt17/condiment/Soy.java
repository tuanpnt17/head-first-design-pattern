/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.condiment;

import com.tuanpnt17.core.Beverage;
import com.tuanpnt17.core.CondimentDecorator;

/**
 *
 * @author TuanPNTSE173039
 */
public class Soy extends CondimentDecorator {

  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.15;
  }

}
