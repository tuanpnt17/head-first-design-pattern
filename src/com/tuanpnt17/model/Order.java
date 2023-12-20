/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17.model;

/**
 *
 * @author TuanPNTSE173039
 */
public class Order {

  private OrderType orderType;
  private BreadType breadType;
  private SauceType sauceType;
  private VegetableType vegetableType;

  public Order() {
  }

  public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
    this.orderType = orderType;
    this.breadType = breadType;
    this.sauceType = sauceType;
    this.vegetableType = vegetableType;
  }

  @Override
  public String toString() {
    return "Order{" + "orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType + ", vegetableType=" + vegetableType + '}';
  }

}
