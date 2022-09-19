// CREATOR: THOMAS HERNANDEZ.
// PURPOSE: PALINDROME PROBLEM.

import java.util.Scanner; // SCANNER IMPORT.

public class PalindromeNumber  // CLASS DECLARATION.
{
   public static boolean isPalindrome(int x) // ISPALINDROME FUNCTION.
   {
       boolean result; // INITIALIZING RESULT BOOLEAN.
       String number = String.valueOf(x); // INITIALZING NUMBER (INPUT) AS A STRING.
       int numberSize = number.length(); // INITIALIZING INT (SIZE OF NUMBER/STRING) VARIABLE.
       for(int i = 0; i < (numberSize / 2); i++) // FOR LOOP TO CHECK PALINDROMENESS.
       {
           if(number.charAt(i) != number.charAt(numberSize - (i + 1))) // IF THE SELECTED NUMBERS DO NOT MATCH.
           {
               return false; // CHECKING COMPLETE, NOT PALINDROME.
           }
           else // IF THE SELECTED NUMBERS DO MATCH.
           {
               continue; // CONTINUE CHECKING.
           }
       }
        
       return true; // CHECKING COMPLETE, IS PALINDROME.
   }

   public static void main(String[] args) // MAIN FUNCTION.
   {
      Scanner input = new Scanner(System.in); // SCANNER INPUT SETUP.
      System.out.print("Hello! Please enter the number you wish to check for a palindrome: "); // PROMPT FOR USER INPUT.

      try
      {
         int p = input.nextInt(); // GATHERING USER INPUT.

         if(p < 0) // IF INPUT IS NEGATIVE.
         {
            p = p * -1; // MAKE INPUT POSITIVE.
         }

         System.out.println(isPalindrome(p)); // CALLING ISPALINDROME FUNCTION WITH INPUT (P VARIABLE).
      }

      catch(Exception e) // ERROR HANDLING.
      {
         System.out.println("ERROR: Please enter valid input only (integers)!"); // ERROR MESSAGE.
      }
   }
}