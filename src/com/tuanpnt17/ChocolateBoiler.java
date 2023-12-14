/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

/**
 *
 * @author TuanPNTSE173039
 */
public class ChocolateBoiler {

  private boolean empty;
  private boolean boiled;

  private static ChocolateBoiler instance;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static synchronized ChocolateBoiler getInstance() {
    //synchronized: we force every thread to wait its turn
    //              before it can enter the method
    if (instance == null) {
      instance = new ChocolateBoiler();
    }
    return instance;
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }

  public void fill() {
    if (isEmpty()) {
      System.out.println("Filling chocolate and milk...");
      this.empty = false;
      this.boiled = false;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      System.out.println("Boiling the mixture...");
      this.boiled = true;
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      System.out.println("Draining the mixtrue...");
      this.empty = true;
    }
  }

}
