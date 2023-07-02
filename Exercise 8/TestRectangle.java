

public class TestRectangle {
    public static void main(String[] args) {
        
        System.out.println(Rectangle.rectangleCount);//0
        
        Rectangle rectangle1 = new Rectangle(10.5,10.23,"Green");
         
        System.out.println(Rectangle.rectangleCount);
        
        rectangle1.setHeight(10.5);
        rectangle1.setWidth(10.23);
        rectangle1.setColour("Green");
        
    
        //02,3
        
        Rectangle rectangle2 = new Rectangle(15.59,89.54,"White");
         
        System.out.println(Rectangle.rectangleCount);
        rectangle2.setHeight(15.59);
        rectangle2.setWidth(89.54);
        rectangle2.setColour("White");
        
        System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter(rectangle1.getHeight(),rectangle1.getWidth()));
        
        System.out.println("The area of rectangle1 is " + rectangle1.getArea(rectangle1.getHeight(),rectangle1.getWidth()));
        
        
        System.out.printf("The perimeter of rectangle1 is %.2f %n " , rectangle2.getPerimeter(rectangle2.getHeight(),rectangle2.getWidth()));
        
        System.out.printf("The area of rectangle1 is %.4f %n " , rectangle2.getArea(rectangle2.getHeight(),rectangle2.getWidth()));
    }
}
