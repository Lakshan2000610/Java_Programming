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
public class Test {

     public static void main(String[] args) {
        Car car = new Car (4,'p',"2342342344");
        Motorcycle motorcycle = new Motorcycle ('p',"02342793428");
        
        car.accelerate();
        car.applyBreaks();
        motorcycle.accelerate();
        motorcycle.applyBreaks();
        
        System.out.println("Details of the Car: Fuel type = " + car.getFuelType()+
                ",Serial number = " +car.getSerialNumber()+
                ",Number of doors = " + car.getNumberOfDoors());
        System.out.println("Details of the Motorcycle: Fuel type = " + motorcycle.getFuelType()+
                " ,Serial number =" + motorcycle.getSerialNumber());
        
        Vehicle v1 = new Car (4,'p',"2342342344");
        
        Vehicle [] vehicles = new Vehicle[5];
        vehicles[0] = new Car (4, 'p',"2342342344");
        vehicles[1] = new Car (4, 'D',"2342342344");
        vehicles[2] = new Motorcycle ('p',"02342793428");
        vehicles[3] = new Motorcycle ('p',"02342793428");
        vehicles[4] = new Motorcycle ('p',"02342793428");
        
        for (Vehicle vehicle : vehicles ){
            System.out.println(vehicle.getSerialNumber());
            
        }
        for (Vehicle vehicle : vehicles ){
            
            System.out.println(vehicle.getFuelType());
        }
    }
}
