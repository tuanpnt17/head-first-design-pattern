/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.component.DarkRoast;
import com.tuanpnt17.component.Decaf;
import com.tuanpnt17.component.Espresso;
import com.tuanpnt17.condiment.Mocha;
import com.tuanpnt17.condiment.Soy;
import com.tuanpnt17.condiment.SteamedMilk;
import com.tuanpnt17.condiment.Whip;
import com.tuanpnt17.core.Beverage;
import java.text.DecimalFormat;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {
    DecimalFormat f = new DecimalFormat(".##");
    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription() + "\t\t$" + f.format(espresso.cost()));
    System.out.println();

    Beverage decaf = new Decaf();
    decaf = new Whip(decaf);
    decaf = new Mocha(decaf);
    System.out.println(decaf.getDescription() + "\t$" + f.format(decaf.cost()));
    System.out.println("");

    Beverage darkRoast = new DarkRoast();
    darkRoast = new Soy(darkRoast);
    darkRoast = new SteamedMilk(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + "\t$" + f.format(darkRoast.cost()));
    System.out.println("");
  }
}
