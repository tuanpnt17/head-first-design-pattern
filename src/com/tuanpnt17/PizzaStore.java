/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

import com.tuanpnt17.pizza.Pizza;
import com.tuanpnt17.pizza.PizzaType;

/**
 *
 * @author TuanPNTSE173039
 */
public abstract class PizzaStore {

  public void orderPizza(PizzaType type) {
    Pizza pizza = createPizza(type);

    System.out.println("Creating " + type + " pizza ...");

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }

  protected abstract Pizza createPizza(PizzaType type);

}
