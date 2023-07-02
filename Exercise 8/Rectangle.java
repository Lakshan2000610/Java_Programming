



public class Rectangle {
    private double height ;
    private double width ;
    private String colour ;
    
    public static int rectangleCount;
    
    Rectangle(double h ,double w , String c){
        height = h;
        width = w ;
        colour = c;
       rectangleCount++; 
    }

    
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public String getColour(){
        return colour;
    }
    
    public double getPerimeter(double h, double w){
        double p = 2*(h+w);
        return p ;
    }
    
    public double getArea(double h, double w){
        double p = (h*w);
        return p ;
    }
 }
    
