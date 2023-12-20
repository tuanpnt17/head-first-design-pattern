/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.BankAccount;
import com.tuanpnt17.FastFoodOrderBuilder;
import com.tuanpnt17.OrderBuilder;
import com.tuanpnt17.model.BreadType;
import com.tuanpnt17.model.Order;
import com.tuanpnt17.model.OrderType;
import com.tuanpnt17.model.SauceType;
import com.tuanpnt17.model.VegetableType;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {
    OrderBuilder fastFoodOrderBuilder = new FastFoodOrderBuilder();
    Order o = fastFoodOrderBuilder
            .orderType(OrderType.ON_SITE)
            .orderBread(BreadType.OMELETTE)
            .orderVegetable(VegetableType.SALAD)
            .build();
    System.out.println(o);

    System.out.println("\n================================================\n");
    BankAccount bankAccount = new BankAccount.BankAccountBuilder("TuanPham", "123")
            .withEmail("tuanpnt17@gmail.com")
            .withMobileBanking(true)
            .build();
    System.out.println(bankAccount);
  }
}
