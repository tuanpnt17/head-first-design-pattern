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
public interface OrderBuilder {

  OrderBuilder orderType(OrderType orderType);

  OrderBuilder orderBread(BreadType breadType);

  OrderBuilder orderSauce(SauceType sauceType);

  OrderBuilder orderVegetable(VegetableType vegetableType);

  Order build();

}
