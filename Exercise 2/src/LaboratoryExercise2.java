import java.util.Scanner;


public class LaboratoryExercise2 {

    
    public static void main(String[] args) {
      // part 01
        Scanner num = new Scanner(System.in); // Create a Scanner object
        
        int no01,no02,no03,no04,no05;
        float avg;
        
        System.out.println("Enter an integer number:");
        no01 = num.nextInt(); // Read user input
   
	      System.out.println("Enter an integer number:");
       no02 = num.nextInt();
      
        System.out.println("Enter an integer number:");
       no03 = num.nextInt();
        
       System.out.println("Enter an integer number:");
       no04 = num.nextInt();
       
       System.out.println("Enter an integer number:");
       no05 = num.nextInt();
        float y =(float)(no01+no02+no03+no04+no05);
        avg=(y/5);
        System.out.println("The average is " + avg); // Output average 
        
        // Part 02
        
         int x =(int)avg; // Convert float to int
         
         int z = (x + ((x*x) / x)); // value
         System.out.println("The value is "+ z);
        
    }
    
}
