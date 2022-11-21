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
    public circle ()
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
    public circle(double r)
    {
        //this.radius = radius;
        radius = r;
        circumference = calcCircumference();
        diameter = getDiameter();
        area = getArea();

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
    
    public double getDiameter(){
    
        return diameter;
    
    }
    
    public double getArea(){
        return area = PI * radius * radius;
    
    }
    
    /**
     * copy Consutrctor info from other to this object 
     * @param circle other
     * 
     */
    
    public circle(circle other){
        //acess private data inside other circle
        this.radius = other.radius;
        this.circumference = other.circumference;
        this.diameter = other.diameter;
        this.area = other.area;
        //compares my own object info with other object info
    }
    /**
     * equals method = true if the radius is the sam as other obj
     * param circle
     * @return coolean
     * 
     */
    public boolean equals (circle other){
        
        return this.radius == other.radius;
        
    }
    
    
    /**
     * toString returns the private data
     * @return String
     */
    
    
    public String toString(){
        String data = "Radius:  "+ radius;
        data +="\nCircumference: "+ circumference;
        data +="\nDiameter      "+ diameter;
        data +="\nArea          "+ area;
        return data;
        
    }
}//end of class