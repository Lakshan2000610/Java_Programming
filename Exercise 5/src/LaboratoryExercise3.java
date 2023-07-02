import java.util.Scanner;



public class LaboratoryExercise3 {

    
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in) ;
        
        System.out.println("Enter your base number :");
        int base = num.nextInt();
        
        System.out.println("Enter your exponent number :");
        int exp =  num.nextInt(); // exponent
        
        long result =1;
        
        for (;exp !=0;--exp){
            result *= base;
        }
        
        System.out.println("Answer = " + result);
    }
    
}
