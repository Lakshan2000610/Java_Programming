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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car Car2 = new Car('M','P',230,2,"251455665C12NM");
        Car Car3 = new Car('A','P');
        Car Car4 = new Car('M','D',"8754GH152N");
        Car Car5 = new Car("4785952NP45");
        
        
        Car1.DisplayDetails();
        Car2.DisplayDetails();
        Car3.DisplayDetails();
        Car4.DisplayDetails();
        Car5.DisplayDetails();
    }
    
}
