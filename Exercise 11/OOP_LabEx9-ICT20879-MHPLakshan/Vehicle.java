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
public class Vehicle {

    private char fuelType ;
    private String serialNumber ;
    
    public Vehicle(char fuelType,String serialNumber){
        this.fuelType = fuelType;
        this.serialNumber = serialNumber ;
    }
    
    public void accelerate(){
        System.out.println("Vehicle is accelerating…");
    }
    
    public void applyBreaks(){
        System.out.println("Vehicle is breaking…");
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
     
}
       
    

   
    

