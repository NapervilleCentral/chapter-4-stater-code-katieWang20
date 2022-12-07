
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class Car
{
    // instance variables
    private int year, miles;
    private String model;
    private double fuelTankLevel;

    /**
     * Constructor for objects of class Car
     * @param int year, String model, int miles, double fuelTankLevel
     */
    public Car(int year, String model, int miles, double fuelTankLevel)
    {
        this.year = year;
        this.model = model;
        this.miles = miles;
        this.fuelTankLevel = fuelTankLevel; ///400 * 100;
        // initialise instance variables
        
    }

    /**
     *no param
     *returns year of car 
     */
    public int getYear()
    {
        // put your code here
        return year;
    }
    /**
     * no param
     * returns car model
     */
    public String getModel(){
        return model;
    }
    
    /**
     * 
     * no param
     * gets miles of car
     */
    public int getMiles(){
        return miles;
    }
    /**
     * 
     * no param
     * returns car model
     */
    public double getFuelTankLevel(){
        
        return fuelTankLevel;
    }
    
    public int addMiles(int milesToAdd){
        return miles = miles + milesToAdd;
    
    }
    /**
     * returns ratio between miles and fuel tank capacity as a percentage
     */
    public double milesToFuelLevel(int miles){
         //make miles double or it returns 0 because ints are just so much more important than doubles I guess
        double convert =100/400* (double)miles; 
 
        
        return convert;
        
    
    }
    
    public double modifyFuelTankLevel(int miles){
        //I SPENT SO LONG FIGURING OUT WHY THIS WASN'T MODIFYING UNTIL I REALIZED MILES IS AN INT AND EVERYTHING ELSE IS A DOUBLE
        
        double miles1 = (double) miles;
        fuelTankLevel = fuelTankLevel - miles1/400 *100;
        if (getFuelTankLevel() <= 0){
            //System.out.println("Fuel tank level is at 0, you cannot change it");
            fuelTankLevel = 0;
            return fuelTankLevel;
        
        }else{
            return fuelTankLevel;
            //if (fuelTankLevel > 0){
              //  return fuelTankLevel;
            //}else{
              //  fuelTankLevel = 0;
                //return fuelTankLevel;
            //}
        }
        
        
    }
    
    public boolean isFuelTankEmpty(){
        boolean empty;
        if (getFuelTankLevel() == 0){
            empty = true;
        }else{
            empty = false;
        }
        return empty;
    }
    
    public String drive(int miles){
        //String result;
        
        modifyFuelTankLevel(miles);
        //System.out.println(fuelTankLevel);   
        if (!isFuelTankEmpty()){
            this.miles = this.miles + miles;
            return "The " + model + " drove " + miles + " for a total mileage of " + this.miles +" and a fuel tank level of " +  getFuelTankLevel() + "%";
            
        }else{
            return "The fuel tank is empty";
        }
        
    }
    
    public String drive(){
        //Math rand = new Math();
        
        Random random = new Random();
        double rand = random.nextInt(10);
        modifyFuelTankLevel((int)rand);
        
        miles = miles + (int) rand;
        
        if (!isFuelTankEmpty()){
            return "The " + model + " drove " + (int)rand + " miles for a total mileage of " + miles +" and a fuel tank level of " +  getFuelTankLevel();
        
        }else{
            return "The fuel tank is empty";
        }
       
    }
    
    public String toString(){
        String data = miles +" Miles";
        return data;
    }
    
    
}

