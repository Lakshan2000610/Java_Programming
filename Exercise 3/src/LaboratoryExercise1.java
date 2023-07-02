import java.util.Scanner;

public class LaboratoryExercise1 {

    
    public static void main(String[] args) {
        Scanner mak = new Scanner(System.in);
        
        System.out.println("Enter your marks: ");
        int m = mak.nextInt();
        
        
        
        if (100>=m && m>=75){
            System.out.println("Your grade is A.");
        }
        
        else if (75>m && m>=60){
            System.out.println("Your grade is B.");
    }
        
        else if (60>m && m>=45){
            System.out.println("Your grade is C.");
    }
        
        else if (45>m && m>=35){
            System.out.println("Your grade is D.");
    }
        else if (35>m && m>=0){
            System.out.println("Your grade is F.");
    }
        
        else{
            System.out.println("Your grade is I.");
    }
        
    }
}
