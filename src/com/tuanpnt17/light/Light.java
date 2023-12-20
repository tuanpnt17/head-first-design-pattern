/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.light;

/**
 *
 * @author TuanPNTSE173039
 */
public class Light {

  private String name;

  public Light(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println("Light " + name + " on...");
  }

  public void off() {
    System.out.println("Light" + name + " off...");
  }
}
