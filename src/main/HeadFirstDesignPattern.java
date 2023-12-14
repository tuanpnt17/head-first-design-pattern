/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.PizzaStore;
import com.tuanpnt17.newyork.NYPizzaStore;
import com.tuanpnt17.pizza.PizzaType;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {

    PizzaStore pizzaStore = new NYPizzaStore();
    pizzaStore.orderPizza(PizzaType.CHEESE);
  }
}
