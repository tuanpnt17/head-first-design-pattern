/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

/**
 *
 * @author TuanPNTSE173039
 */
public class TurkeyAdapter implements Duck { //adapter

  private Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    this.turkey.gay();
  }

  @Override
  public void fly() {
    for (int i = 0; i < 2; i++) {
      this.turkey.bayGan();
    }
  }

}
