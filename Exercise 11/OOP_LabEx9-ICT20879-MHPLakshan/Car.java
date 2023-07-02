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
public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(int numberOfDoors, char fuelType, String serialNumber) {
        super(fuelType, serialNumber);
        this.numberOfDoors = numberOfDoors ;
    }

   

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    
    

}
