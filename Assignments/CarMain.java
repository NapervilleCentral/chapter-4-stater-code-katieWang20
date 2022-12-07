
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
       
       Car aCar = new Car(1920, "Camry", 34, 50);
       Car car2 = new Car(1980, "Volvo", 20, 14);
       //System.out.println(aCar.getYear());
       
       getterTest(aCar);
       getterTest(car2);
       System.out.println();
       System.out.println("Miles: " + aCar.getMiles());
       addMilesTest(aCar, 1);
       System.out.println("Miles after adding: " + aCar.getMiles() +"\n");
       //call toString of Car after calling addMilesTest
       
       /**
        * you can change count as you see fit
        * run loop until one of the Cars drive 100 miles and print out
        * which car "won"
        */
       /*
       addMilesTest(aCar, 10);
       System.out.println("Fuel tank level percentage: " + aCar.getFuelTankLevel());
       */
       System.out.println("miles to fuel level ratio: "+ aCar.milesToFuelLevel(87));
       System.out.println("%");
       //System.out.println((double) 1/4);       
       System.out.printf("Fuel tank level: %.2f", aCar.getFuelTankLevel());
       System.out.println("%");
       System.out.printf("Fuel tank level after change: %.2f", aCar.modifyFuelTankLevel(10));
       System.out.println("%");
       System.out.println();
       
       while (count1 < GOAL && count2 < GOAL)
      {
         System.out.println(aCar.drive());
         System.out.println(car2.drive(5));
         System.out.println();
        
         // Print the drive results (uses Coin's toString method)
         System.out.print ("Car 1: " + aCar + "\n");
         System.out.println ("Car 2: " + car2);
         System.out.println();
         // Increment the counters
         count1 = aCar.getMiles();
         count2 = car2.getMiles();
         
        
      }
      System.out.println();
      if (count1 == GOAL){
                System.out.println("The " + aCar.getModel() + " wins");
                
      }else{
                System.out.println("The " + car2.getModel() + " wins");
      }
      
   }
   
     //Prints out the information for each getter method
    
   public static void getterTest(Car mine)
   {
       System.out.println("Year of car: " + mine.getYear());
       System.out.println("Model of car: " + mine.getModel());
       System.out.println("Miles of car: " + mine.getMiles());
       System.out.println("Fuel tank level of car: " + mine.getFuelTankLevel());
       
   }
   
   /**
    * Takes a car and adds given miles
    * @param 
    */
   public static void addMilesTest(Car mine, int miles)
   {
       
       mine.addMiles(miles);
       mine.addMiles(miles);
       
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
