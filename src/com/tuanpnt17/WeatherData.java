/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuanpnt17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TuanPNTSE173039
 */
public class WeatherData implements Subject {

  private List<Observer> observerList;
  private float temperature;
  private float huminidy;
  private float pressure;

  public WeatherData() {
    observerList = new ArrayList<>();
  }

  public void setMeasurements(float temperature, float huminidy, float pressure) {
    this.temperature = temperature;
    this.huminidy = huminidy;
    this.pressure = pressure;
    this.measurementsChanged();
  }

  public void measurementsChanged() {
    this.notifyObserver();
  }

  @Override
  public void registerObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int o = observerList.indexOf(observer);
    if (o >= 0) {
      observerList.remove(o);
    }
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : observerList) {
      observer.update(temperature, huminidy, pressure);
    }
  }

}
