/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.losangeles;

import com.tuanpnt17.PizzaStore;
import com.tuanpnt17.pizza.Pizza;
import com.tuanpnt17.pizza.PizzaType;
import static com.tuanpnt17.pizza.PizzaType.CHEESE;
import static com.tuanpnt17.pizza.PizzaType.CLAM;
import static com.tuanpnt17.pizza.PizzaType.PEPPERONI;
import static com.tuanpnt17.pizza.PizzaType.VEGGIE;

/**
 *
 * @author TuanPNTSE173039
 */
public class LAPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new LAStyleCheesePizza();
        break;
      case CLAM:
        pizza = new LAStyleClamPizza();
        break;
      case PEPPERONI:
        pizza = new LAStylePepperoniPizza();
        break;
      case VEGGIE:
        pizza = new LAStyleVeggiePizza();
        break;
    }
    return pizza;
  }

}
