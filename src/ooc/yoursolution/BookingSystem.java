/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.*;
import ooc.yoursolution.BookingSystemInterface;
import ooc.yoursolution.RentACarInterface;
import ooc.yoursolution.RentACar;

/**
 *
 * @author edgardpacheco
 */
public class BookingSystem implements BookingSystemInterface {
    
    
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {

        String data_file, store;
        double rate; // Varible rate 
        int amount; // amount of car 
        
        //Creating Array for cars
        List<Car> cars = new ArrayList<>();
        
        store = in.readLine(); // getting the first line ( name of store)

        // While to split all the txt file 
        while ((data_file = in.readLine()) != null) {
            String s[] = data_file.split(":");

            
            Make make = Make.valueOf(s[0]); // getting the brand of the car 
            rate = Double.parseDouble(s[1]); //  getting the rate of the car 
            amount = Integer.parseInt(s[2]); //  getting amount avaible of the car 

            for (int i=0; i<amount; i++) {
                Car car = new Car(i, make, rate);
                cars.add(car);
            }
        }

        RentACarInterface rentACarInterface = new RentACar(cars, store);
        return rentACarInterface;
    }
}