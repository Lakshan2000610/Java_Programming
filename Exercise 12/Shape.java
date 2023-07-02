/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public abstract class Shape {
    
    private String colour;
    public Shape (String colour){
        this.colour=colour;
        
    }
    //colour setter method
    public void setColour(String colour){
        this.colour=colour;
    }
    //colour getter method
    public String getColour(){
        return colour;
    }
    
     abstract double getPerimeter();
     abstract double getArea();
}

