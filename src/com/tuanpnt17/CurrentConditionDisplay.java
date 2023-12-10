/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

/**
 *
 * @author TuanPNTSE173039
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

  private float temperature;
  private float huminidy;
  private Subject weatherData;

  public CurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float huminidy, float pressure) {
    this.temperature = temp;
    this.huminidy = huminidy;
    display();

  }

  @Override
  public void display() {
    System.out.println(String.format("| %-20s | %7.2f | %7.2f |",
            "Current Condition", this.temperature, this.huminidy));
  }

}
