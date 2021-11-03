/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.*;
import ooc.yoursolution.CarInterface;

/**
 *
 * @author edgardpacheco
 */
public class Car implements CarInterface {
    
  private int id;
  private Make make;
  private double rate;  
    
  public Car(int id, Make make, double rate) {
        this.id = id;
        this.make = make;
        this.rate = rate;
        
    }
  
      @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }



    @Override
    public int getId() {
        return id;
    }  
  
    
}
