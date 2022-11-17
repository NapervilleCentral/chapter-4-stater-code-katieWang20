//********************************************************************
//  Die.java
//
//********************************************************************

import java.util.Random;
public class Die
{
   private final int MIN_FACES = 4;


   private static Random generator = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
      
      
   }
   
   

   
   /**
        constructor
     Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random.
     @parm int number of sides of the die
   */

   /**
           Rolls the die and returns the result.
           @return
   */
  
   public Die(int numFaces){
       numFaces = numFaces;
       
   }
   public int roll ()
   {
       Random rand = new Random();
       faceValue = 0; // you put the correct  code here
      faceValue = rand.nextInt(6)-4;
      
      return faceValue;
   }

   /**
           Returns the current die value.
           @return _____________________write comment
   */
   public int getFaceValue ()
   {
      return faceValue;
   }


  /**
        Returns the current number of faces the die has.
        @return _________________
  */
    public int getFaces(){
        numFaces = setFaces();
        return numFaces;
        
    }
 

  /**
          Sets the number of faces of the Die
          @param _________________
  */

    private int setFaces(){
        if (numFaces < 4){
            numFaces = 4;
        }
        
        return numFaces;
    }

   /**
           Returns the current die value and number of sides as a String.
           @return _____________
   */
   public String methodName ()
   {
      String data ="";

      data = "num of faces: " + numFaces;
      data+= "value of face: " + faceValue;

      return data;
   }




}//end of calss Die
