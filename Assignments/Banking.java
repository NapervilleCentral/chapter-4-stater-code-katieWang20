//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      Account acct4 = null;
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      Scanner input = new Scanner(System.in);
      
      System.out.println();
      
      
      System.out.println("Enter first and last name: ");
      String name = input.nextLine();
      System.out.println("Enter PIN number: ");
      int number = input.nextInt();
      System.out.println("Enter balance: ");
      double balance = input.nextDouble();
      
      acct4 = new Account(name, number, balance);
      
      
      acct1.deposit (25.85);
      System.out.println("Ted's amount after deposit: $" + acct1.getBalance());
      System.out.println();
      
      double gomezBalance = acct2.deposit (500.00);
      System.out.println ("Gomez balance after deposit: $" +
                          gomezBalance);
      System.out.println();

      System.out.println ("Gomez balance after withdrawal: $" +
                          acct2.withdraw (430.75, 1.50));
        
      acct3.withdraw (800.00, 0.0);  // exceeds balance
      System.out.println("Ted's's balance before transfer from Sanchit: " + fmt.format(acct1.getBalance()));
      acct3.transfer(acct1);
      
      System.out.println();
      
      System.out.println("Ted's balance after transfer from Sanchit: " + acct1.getBalance());
      
      acct1.addInterest();
      System.out.print("Ted's balance after interest: " + fmt.format(acct1.getBalance()));
      System.out.println();
      acct2.addInterest();
      acct3.addInterest();
      
      
              
      System.out.println ();
      System.out.println (acct1);
      System.out.println();
      System.out.println (acct2);
      System.out.println();
      System.out.println (acct3);
      System.out.println();
      System.out.println(acct4);
      
      
      
   }
}
