/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

import com.tuanpnt17.model.BreadType;
import com.tuanpnt17.model.Order;
import com.tuanpnt17.model.OrderType;
import com.tuanpnt17.model.SauceType;
import com.tuanpnt17.model.VegetableType;

/**
 *
 * @author TuanPNTSE173039
 */
public class FastFoodOrderBuilder implements OrderBuilder {

  private OrderType orderType;
  private BreadType breadType;
  private SauceType sauceType;
  private VegetableType vegetableType;

  @Override
  public OrderBuilder orderType(OrderType orderType) {
    this.orderType = orderType;
    return this;
  }

  @Override
  public OrderBuilder orderBread(BreadType breadType) {
    this.breadType = breadType;
    return this;
  }

  @Override
  public OrderBuilder orderSauce(SauceType sauceType) {
    this.sauceType = sauceType;
    return this;
  }

  @Override
  public OrderBuilder orderVegetable(VegetableType vegetableType) {
    this.vegetableType = vegetableType;
    return this;
  }

  @Override
  public Order build() {
    return new Order(orderType, breadType, sauceType, vegetableType);
  }

}
