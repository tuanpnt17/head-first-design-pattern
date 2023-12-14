/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.newyork;

import com.tuanpnt17.PizzaStore;
import com.tuanpnt17.pizza.Pizza;
import com.tuanpnt17.pizza.PizzaType;
import static com.tuanpnt17.pizza.PizzaType.*;

/**
 *
 * @author TuanPNTSE173039
 */
public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new NYStyleCheesePizza();
        break;
      case CLAM:
        pizza = new NYStyleClamPizza();
        break;
      case PEPPERONI:
        pizza = new NYStylePepperoniPizza();
        break;
      case VEGGIE:
        pizza = new NYStyleVeggiePizza();
        break;
    }
    return pizza;
  }

}
