
/**
 * Write a description of class CarMain here.
 * 
 * @author (your name)
 * fuel tank level is a percentage
 * @version (a version number or a date)
 */
public class CarMain
{   public static int GOAL = 100;
    public static void main (String[] args)
   {
       int count1=0, count2=0;
       
       Car aCar = new Car(1920, "Camry", 34, 20.1);
       
       System.out.println(aCar.getYear());
       getterTest(aCar);
       
       //call toString of Car after calling addMilesTest
       
       /**
        * you can change count as you see fit
        * run loop until one of the Cars drive 100 miles and print out
        * which car "won"
        */
       /*
       while (count1 < GOAL && count2 < GOAL)
      {
         car1.drive();
         car2.drive(5);

         // Print the drive results (uses Coin's toString method)
         System.out.print ("Car 1: " + car1);
         System.out.println ("   Car 2: " + car2);

         // Increment the counters
         
      }*/
   }
   
     //Prints out the information for each getter method
    
   public static void getterTest(Car mine)
   {
       System.out.println("Year of car: " + mine.getYear());
       System.out.println("Model of car: " + mine.getModel());
       System.out.println("Miles of car: " + mine.getMiles());
       System.out.println("Fuel tank level of car: " + mine.getFuelTank());
       
   }
   
   /**
    * Takes a car and adds given miles
    * @param 
    */
   public static void addMilesTest(Car mine, int miles)
   {
       mine.miles = mine.miles + miles;
       
   }
   
   /**
    * Takes a car and adds given miles
    * @param 
    **/
   public static void isFuelTankEmptyTests(Car mine)
   {
       if(mine.isFuelTankEmpty() == true)
       {
           System.out.print("Better start Walking");
       }else{
            System.out.print("Keep on driving");
        }
   }
   
}
