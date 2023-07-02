
public class Square {
    int length;
    String colour ;
    
    void displayColour(){
        System.out.println("Colour: "+ colour);
    }
    
    void displayArea(){
        System.out.println("Area : " + length*length );
    }
    
    void displayPerimeter(){
        System.out.println("Perimeter : " + length*4 +"\n" );
    }
}
