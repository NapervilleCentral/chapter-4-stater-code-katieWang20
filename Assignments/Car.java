
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        this.fuelTankLevel = fuelTankLevel;
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
        double fuelTankLevelVol = fuelTankLevel/100;
        double ratio = miles*fuelTankLevelVol;
        
        return ratio;
        
    
    }
    
    public double modifyFuelTankLevel(int miles){
        if (getFuelTankLevel() == 0){
            System.out.println("Fuel tank level is at 0, you cannot change it");
            return fuelTankLevel;
        
        }else{
            fuelTankLevel = fuelTankLevel/100 - miles/400;
            if (fuelTankLevel > 0){
                return fuelTankLevel;
            }else{
                fuelTankLevel = 0;
                return fuelTankLevel;
            }
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
    
    
}
