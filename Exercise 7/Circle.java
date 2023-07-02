
public class Circle {
     private  double Radius ;
     private String Colour;
     
     //set method
     public void setRadius(double Radius){
        this.Radius = Radius ;
    }
    
    //get method
    public double getRadius (){
        return Radius ;
    }
    
      //set method
     public void setColour(String Colour){
        this.Colour = Colour ;
    }
     
     //get method
    public String getColour (){
        return Colour ;
    }
     
    public double getPerimeter (double Radius){
        double Perimeter = 2*(Math.PI*Radius) ;
        return Perimeter ;
    }
    
    public double getArea (double Radius){
        double Area = Math.PI*(Radius*Radius) ;
        return Area ;
    }
}
