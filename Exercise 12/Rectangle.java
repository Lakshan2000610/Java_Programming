/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Rectangle extends Shape {
    private double height;
    private double width;
    
    public Rectangle (String colour,double height, double width){
     super(colour);
     this.height=height;
     this.width=width;
    }
    
    //Height Setter Method
    public void setHeight(double height){
        this.height=height;
    }
    
    //Height Getter Method
    public double getHeight(){
        return height;
    }
    
    //Width Setter Method
    public void setWidth(double width){
    this.width = width;
    }
    
    //Width Getter Method
    public double getWidth(){
    return width;
    }  
    
    @Override
    public double getPerimeter(){
        double perimeter = (2*height)+(2*width);
        return perimeter;
    }
    
    @Override
    public double getArea(){
        double area = height*width;
        return area;
    }
}

