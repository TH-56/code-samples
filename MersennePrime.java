// CREATOR: Thomas Hernandez.
// PURPOSE: Mersenne Prime Problem.

import java.util.Scanner; // SCANNER IMPORT.

public class MersennePrime // CLASS DECLARATION.
{
	public static void main(String[] args) // MAIN FUNCTION.
   {
      long p = 0; // INITIALIZE # TO CHECK.
      Scanner input = new Scanner(System.in); // SCANNER INPUT SETUP.
      System.out.print("Hello! Please enter the number you wish to check: "); // PROMPT FOR USER INPUT.
      p = input.nextLong(); // GATHERING USER INPUT.
      if(p < 2) // ERROR HANDLING.
      {
         System.out.println("INVALID INPUT! VALUE MUST BE GREATER THAN OR EQUAL TO TWO!"); // DISPLAYING ERROR MESSAGE.
      }
      else // PROCEED TO THE REST OF THE PROGRAM IF THERE ARE NO ERRORS.
      {
         PrimeChecker(p); // CALLING FUNCTION USING USER INPUT.
      }
   }
   
   public static boolean PrimeChecker(long input) // PRIME AND MERSENNE CHECKER.
   {
      boolean prime = true; // INITIALIZE PRIME BOOLEAN.
      boolean secondPrime = true; // INITIALIZING SECONDPRIME BOOLEAN.
      
      for(int a = 2; a < input; a++) // FOR LOOP TO CHECK INITIAL PRIMALITY.
      {
         if((input % a) == 0) // IF ANY # OTHER THAN 1 AND/OR P IS DIVISIBLE, THEN P IS NOT PRIME OR MERSENNE.
         {
            System.out.println(input + " IS NOT PRIME."); // NOT PRIME DISPLAY MESSAGE.
            prime = false; // SETTING PRIME BOOLEAN TO FALSE.
            secondPrime = false; // SETTING SECONDPRIME BOOLEAN TO FALSE.
            break; // STOP THE LOOP, THE NUMBER IS NOT PRIME, THUS CANNOT BE MERSENNE.
         }
      }
      
      if(prime == true) // IF NO # EXCEPT FOR 1 AND/OR P WAS DIVISIBLE, THEN P IS PRIME. NOW WE CHECK FOR MERSENNE.
      {
         long temp = 0; // INITIALIZING TEMP VARIABLE.
         temp = (long)((Math.pow(2, input)) - 1); // SETTING TEMP AS THE MERSENNE EQUATION.
         for(int a = 2; a < temp; a++) // FOR LOOP TO CHECK PRIMALITY/MERSENNENESS.
         {
            if((temp % a) == 0) // IF ANY # OTHER THAN 1 AND/OR P IS DIVISIBLE, THEN P IS NOT PRIME/MERSENNE.
            {
               System.out.println(input + " IS PRIME, BUT DOES NOT RESULT IN A MERSENNE PRIME."); // NOT MERSENNE PRIME DISPLAY MESSAGE.
               secondPrime = false; // SETTING BOOL TO FALSE TO CANCEL NEXT ACTION.
               break; // BREAK STATEMENT.
            }
         }
         
         if(secondPrime == true) // IF SECONDPRIME IS PRIME (IS MERSENNE).
         {
            System.out.println(input + " IS PRIME, AND GIVES THE MERSENNE PRIME " + temp + " [FROM: (2^" + input + ") - 1]."); // MERSENNE PRIME DISPLAY MESSAGE.
         }
      }
      
      return secondPrime; // RETURNING RESULTS.
      
   }
}