import java.util.Scanner;


/**
 *
 * @author hp
 */
public class LaboratoryExercise2 {

   
    public static void main(String[] args) {
         Scanner mak = new Scanner(System.in);
        System.out.println("Grade  \t\t Your choice  \n\n A  \t\t 1 \n B/C  \t\t 2 \n D \t\t 3 \n F \t\t 4 \n  ");
        
        
        System.out.println("Enter your grade:");
        int m = mak.nextInt();
       
        
     switch(m) {
        case 1:
          System.out.println("Excellent!");
          break;
        case 2:
          System.out.println("Well done!");
          break;

       case 3:
          System.out.println("Passed!");
          break;

       case 4:
          System.out.println("Try again please…");
          break;

      default:
          System.out.println("Invalid grade.");
          break;
    }
    }
    
}
