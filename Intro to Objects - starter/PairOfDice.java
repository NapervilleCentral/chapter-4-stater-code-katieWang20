// student outline of Pair of Dice

public class PairOfDice
{
    //private data-- 2 die


    private Die die1, die2;
    


    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */
    
    public PairOfDice(){
        die1 = new Die();
        die2 = new Die();
    
    }
    
    


    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return int
    */
   
    public int roll(){
        return die1.roll() + die2.roll();
        
    }


    /**-------------- getTotal()
        Returns the current combined dice total.
        @return
    */

    public int getTotal(){
        return die1.getFaceValue() + die2.getFaceValue();
        
    }
        
    
    

    /**---------------- getDie1()
        Returns the current value of the first die.
        @return
    */
    
    public int getDie1(){
         return die1.getFaceValue();
    
    }
    
    /**------------- getDie2()
        Returns the current value of the second die.
        @return
    */
    public int getDie2(){
    
        return die2.getFaceValue();
    }

    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */
    public String toString(){
        String info = "";
        info += "Face of die1 : " + getDie1();
        
        return info;
    
    }
    


}
