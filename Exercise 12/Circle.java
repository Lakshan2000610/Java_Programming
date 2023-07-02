/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class Circle extends Shape {
    private double radius;
    
    Circle(String colour, double radius){
        super(colour);
        this.radius = radius;
    }
  //Radius Setter Method
    public void setRadius (double radius){
        this.radius=radius;
    }
  //Radius Getter Method
    public double getRadius (double radius){
        return radius;
    }
    
  @Override
  public double getPerimeter(){
      double perimeter = 2*(Math.PI*radius);
      //Return rounded perimeter;
      double roundOff = (Math.round(perimeter*100.0)/100.0);
      return roundOff;
  }
  
  @Override
  public double getArea(){
      double area = Math.PI*(radius*radius);
      //Return rounded area;
      double roundOff = (Math.round(area*100.0)/100.0);
      return roundOff;
  }
    
}
