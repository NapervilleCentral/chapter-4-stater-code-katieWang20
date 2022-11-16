import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.lang.Math;

//import javax.swing.*;

public class mathy
{
    private double area=0;

    /**
        default constructor - stubed in
    */
    public mathy( )
    {
        area = 0;
        
    

    }//end of default const

    /**
     * constructor that sets area
     * @param int area
     */

    public mathy (int a){
        area = a;
        System.out.println ("hi from default constructor (constructor (int))" );
    }
    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
        */
    public int abs (int x)
    {
       
        if (x<0)
            x = -x;
            
        return x;

    }//end of abs

    /**
     * add method will return the sum of the two numbers
     * @ param int x, int y
     * @ return int sum
     */ 
    
    
    
    public int add (int x, int y){
        
        return x + y;
    
    
    }
    
    public int add(int x, int y, int z){
    
        return x + y + z;
        
    }

    /**
     * circleArea calculates that area of a circle
     * @param int r 
     * @return double area
     * 
     */
    public double circleArea(int r){
        // local variable takes precedence
        area = Math.pow(r, 2) * Math.PI;  
        return area;
        
    }
    
    /**
     * 
     * getArea
     * @return the area that has been calculated
     * 
     */

    public double getArea(){
        return area;
    }

    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */

    //public int add (int x, int y)
    //end of add


    //public double add (double x,double y)
    

    /**
            toString
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


}//end of class