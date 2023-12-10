/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
this template
 */
package main;

import com.tuanpnt17.CurrentConditionDisplay;
import com.tuanpnt17.WeatherData;

/**
 *
 * @author TuanPNTSE173039
 */
public class HeadFirstDesignPattern {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 50, 29.3f);
    weatherData.setMeasurements(78, 80, 55.4f);

  }
}
