/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory.exercise.pkg9;

/**
 *
 * @author hp
 */
public class Motorcycle extends Vehicle{

    public Motorcycle(char fuelType, String serialNumber) {
        super(fuelType, serialNumber);
    }
    
    public void accelerate(){
        System.out.println("Motorcycle is accelerating…");
    }
    
     public void applyBreaks(){
        System.out.println("Motorcycle is breaking…");
    }
}
