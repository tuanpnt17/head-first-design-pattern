/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.Duck;
import com.tuanpnt17.MallardDuck;
import com.tuanpnt17.*;
import com.tuanpnt17.TurkeyAdapter;
import com.tuanpnt17.WildTurkeys;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {
    Duck mallarDuck = new MallardDuck();

    Turkey wildTurkey = new WildTurkeys();
    Duck convertTurkeyToDuck = new TurkeyAdapter(wildTurkey);

    mallarDuck.quack();
    mallarDuck.fly();

    System.out.println("---");
    wildTurkey.gay();
    wildTurkey.bayGan();

    System.out.println("---");
    convertTurkeyToDuck.quack();
    convertTurkeyToDuck.fly();

  }
}
