
public class Test {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        
        employee1.Employeenumber =  10908;
        employee1.firstname = "Bruce" ;
        employee1.Lastname = "Wayne";
        employee1.Gender = "CEO";
        employee1.Salary = 12175362.10;
        
        employee1.displayDetails();
        
         Employee employee2 = new Employee();
        
        employee2.Employeenumber =  11548;
        employee2.firstname = "Lois" ;
        employee2.Lastname = "Lane";
        employee2.Gender = "Office Administrator";
        employee2.Salary = 10815.70;
        
        employee2.displayDetails();
        
        Square square1 = new Square();
        square1.colour = "Blue" ;
        square1.length = 45 ;
        square1.displayColour();
        square1.displayArea();
        square1.displayPerimeter();
        
        
        Square square2 = new Square();
        square2.colour = "Red" ;
        square2.length = 31 ;
        square2.displayColour();
        square2.displayArea();
        square2.displayPerimeter();
        
        
    }
}
