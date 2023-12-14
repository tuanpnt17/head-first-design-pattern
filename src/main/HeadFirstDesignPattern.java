/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.ChocolateBoiler;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {
    ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
    chocolateBoiler.fill();
    chocolateBoiler.boil();
    chocolateBoiler.drain();
  }
}
