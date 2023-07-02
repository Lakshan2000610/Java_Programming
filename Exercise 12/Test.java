/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Test {
    /*
    * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        Circle circle1 = new Circle ("Green",7);
        Rectangle rect1 = new Rectangle("Blue",4,8);
        
        System.out.println("Circle 1 :");
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        
        System.out.println("Rectangle 1 :");
        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getArea());
        
        Shape[] shapeArr;
        shapeArr = new Shape[4];
        
        shapeArr[0] = new Circle ("Red",5);
        shapeArr[1] = new Circle ("Black",5);
        shapeArr[2] = new Rectangle ("Yellow",6,8);
        shapeArr[3] = new Rectangle ("Brown",3,7);
        
        for (Shape shape : shapeArr){
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        }
    }
}
