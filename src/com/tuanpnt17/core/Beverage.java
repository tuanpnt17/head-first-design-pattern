/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.core;

/**
 *
 * @author TuanPNTSE173039
 */
public abstract class Beverage {

  protected String description = "Unknown Beverage";

  public String getDescription() {
    return this.description;
  }

  public abstract double cost();

}
