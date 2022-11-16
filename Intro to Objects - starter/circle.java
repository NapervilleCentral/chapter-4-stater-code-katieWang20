/*************************************************
Class circle

************************************************/

import java.awt.*;
//import java.applet.Applet;

public class circle
{
    // private data
    // int xCenter, yCenter, radius;
    public final double PI = 3.1415962;
    
    private double diameter, circumference, radius, area;


    /**
    //Default Constructor:
    */
    public circle ( )
    {
        
        radius = 0;
        diameter = 0;
        circumference = 0;
        area = 0;
        System.out.println("default   " + radius);
    }

    /**
    //Constructor
    */
    public circle(double radius)
    {
        this.radius = radius;
        circumference = calcCircumference();

    }
     /**
      * calcCircumference
      * @return the proper circumference
      * 
      */
    public double calcCircumference(){
        return 2 * PI * radius;     
        
    
    }
    /*
     * calcDiameter calc and sets the diameter
     * 
     */
    
    public void calcDiameter(){
        diameter = 2 * radius; 
        
          
    }
    
    public void getArea(){
        
    
    }
    
    
    /**
     * toString returns the private data
     * @return String
     */
    
    
    public String toString(){
        String data = "Radius:  "+radius;
        data+="\nCircumference: "+ circumference;
        data +="\nDiameter      "+ diameter;
        data +="\nArea            "+ area;
        return data;
        
    }
}//end of class