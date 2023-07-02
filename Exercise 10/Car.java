/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory.exercise.pkg8;

/**
 *
 * @author hp
 */
public class Car {
    
    private char TransmissionType;
    private char fuelType;
    private double topSpeed;
    private int numberOfDoors;
    private String Serialnumber; 
    
    public Car(){
    
    }

    public Car(char TransmissionType, char fuelType, double topSpeed, int numberOfDoors, String Serialnumber) {
        this.TransmissionType = TransmissionType;
        this.fuelType = fuelType;
        this.topSpeed = topSpeed;
        this.numberOfDoors = numberOfDoors;
        this.Serialnumber = Serialnumber;
    }
    
    
    public Car(char TransmissionType, char fuelType) {
        this.TransmissionType = TransmissionType;
        this.fuelType = fuelType;
    }

    public Car(char TransmissionType, char fuelType, String Serialnumber) {
        this.TransmissionType = TransmissionType;
        this.fuelType = fuelType;
        this.Serialnumber = Serialnumber;
    }

    public Car(String Serialnumber) {
        this.Serialnumber = Serialnumber;
    }
    
    

    public char getTransmissionType() {
        return TransmissionType;
    }

    public void setTransmissionType(char TransmissionType) {
        this.TransmissionType = TransmissionType;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getSerialnumber() {
        return Serialnumber;
    }

    public void setSerialnumber(String Serialnumber) {
        this.Serialnumber = Serialnumber;
    }

    
    public void DisplayDetails() {
        System.out.println( "Car{" + "TransmissionType=" + TransmissionType + ", fuelType=" + fuelType + ", topSpeed=" + topSpeed + ", numberOfDoors=" + numberOfDoors + ", Serialnumber=" + Serialnumber + '}');
    }
    
    

}
