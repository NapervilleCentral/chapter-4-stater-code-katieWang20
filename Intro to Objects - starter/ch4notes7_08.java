/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08
{

    //static int sum = 987654;

    public static void main (String[] args)
    {
    
        mathy solver = new mathy();
    
        System.out.println(solver.abs(-5)); //obj.method()
        System.out.println(abs(-8) * abs(5.2)); //function (-8 is an argument)
        System.out.println(-5.555);
    /**/
    }// end of main
    
    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
   //public or private - where you can view/use
   //static - dont worry about it
   //return type - basic data type or object dont put void nobody uses that
   //name () - this is the method signature
   public static double abs(double x){ //if name is same, but type or amount is changed, it changes the method 'signature' and the computer will the right one

       if (x<0)                        //this is called overloading. abs is an overloaded method
           x = -x;
           
           return x;

   } 
   
   public static int abs (int x) // <--parameter
       {
        if (x < 0)
            x = -x;
    
        return x;
    
    }//end of abs
    
    /**
        take the absoulute value of the number
        @param double value
        @return absoulute value of number
    */
    
    
    
    
    
    
    //public static int add (int x, int y)



}// end of class









