/**
*   Name
*    Date
    Class name
    Description
******************************************************************* */

public class Rational
{
   private int numerator, denominator;

   /**----------------------------------------------------------------
   *  Sets up the rational number by ensuring a nonzero denominator
   *  and making only the numerator signed.
   */
   public Rational (int numer, int denom)
   {
      if (denom == 0)
         denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
         numer = numer * -1;
         denom = denom * -1;
      }

      numerator = numer;
      denominator = denom;

      reduce();
   }

   /**----------------------------------------------------------------
   *  Returns the numerator of this rational number.
   ----------------------------------------------------------------*/
   public int getNumerator ()
   {
      return numerator;
   }

   /**----------------------------------------------------------------
   *  Returns the denominator of this rational number.
   ----------------------------------------------------------------*/
   public int getDenominator ()
   {
      return denominator;
   }

   /**----------------------------------------------------------------
   *  Returns the reciprocal of this rational number.
  */
   public Rational reciprocal ()
   {
      return new Rational (denominator, numerator);
   }

   /**----------------------------------------------------------------
   *  Adds this rational number to the one passed as a parameter.
   *  A common denominator is found by multiplying the individual
   *  denominators.
   */
   public Rational add (Rational op2)
   {
        int augend1 = this.getNumerator() * op2.getDenominator();
        int augend2 = op2.getNumerator() * this.getDenominator();
        int commonDenominator = this.getDenominator() * op2.getDenominator();
        int numeratorSum = augend1 + augend2;
        
        return new Rational(numeratorSum, commonDenominator);
   }

   /**----------------------------------------------------------------
   *  Subtracts the rational number passed as a parameter from this
   *  rational number.
   */
   public Rational subtract (Rational op2)
   {
        int minuend = this.getNumerator() * op2.getDenominator();
        int subtrahend = op2.getNumerator() * this.getDenominator();
        int commonDenominator = this.getDenominator() * op2.getDenominator();
        
        int difference = minuend - subtrahend;
        
        return new Rational (difference, commonDenominator);
        
        
   }

   /**----------------------------------------------------------------
   *  Multiplies this rational number by the one passed as a
   *  parameter.
   */
   public Rational multiply (Rational op2)
   {
        int numeratorProduct = this.getNumerator() * op2.getNumerator();
        int denominatorProduct = this.getDenominator() * op2.getDenominator();
        
        return new Rational (numeratorProduct, denominatorProduct);
   }

   /**----------------------------------------------------------------
   *  Divides this rational number by the one passed as a parameter
   *  by multiplying by the reciprocal of the second rational.
   *  Do the thing where u multiply the numerator of the first equation with the flipped denominator of the second fraction
   *  and then multipley this.denmomoinator with op numerator
   *  I hope that makes sense., Jusyt remember how dividing fractions works ok 
   *  im so tired and gassss
   *  a mirmir
   *  :((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
   */
   public Rational divide (Rational op2)
   {
       int numeratorResult = this.getNumerator() * op2.getDenominator();
       int denominatorResult = this.getDenominator() * op2.getNumerator();
       
       return new Rational (numeratorResult, denominatorResult);
   }

   /**----------------------------------------------------------------
   *  Determines if this rational number is equal to the one passed
   *  as a parameter.  Assumes they are both reduced.
   */
   public boolean equals (Rational op2)
   {
    boolean equal;
    if (this.getNumerator() == op2.getNumerator() && this.getDenominator() == op2.getDenominator()){
        return equal = true;
        
    }else{
        return equal = false;
    }
   }

   /**----------------------------------------------------------------
   *  Returns this rational number as a string.
   */
   public String toString ()
   {
      String result = "";
      result += numerator + "/" + denominator;
    
      return result;
   }

   /**----------------------------------------------------------------
   *  Reduces this rational number by dividing both the numerator
   *  and the denominator by their greatest common divisor.
   */
   private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   /**----------------------------------------------------------------
   *  Computes and returns the greatest common divisor of the two
   *  positive parameters. Uses Euclid's algorithm.
   */
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
}
