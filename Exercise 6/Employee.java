
public class Employee {
   int Employeenumber;
   String firstname ;
   String Lastname;
   String Gender;
   double Salary;
   
   void displayDetails(){
       System.out.println("The details of the employee " + Employeenumber + ".");
       System.out.println("Full name: " + firstname + " " + Lastname);
       System.out.println("Gender : " + Gender);
       System.out.println("Salary : " + Salary + "\n");
   }
}
