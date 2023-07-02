
public class NewClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle() ;
        
        circle1.setRadius(7);
        circle1.setColour("red");
       
        
        System.out.println("The perimeter of circle1 is " + circle1.getPerimeter (circle1.getRadius()) );
        
        System.out.println("The area of circle1 " + circle1.getArea(circle1.getRadius()));
    
    }
    
    
}
