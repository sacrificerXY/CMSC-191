/*
2015-12593
Programming Assignment 1 - Familiarizing Java Constructs and Structures
*/
package numbertoword;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class NumberToWord 
{
    private static Scanner scanner;
    
    // number convertion loopup tables
    private static Map<Integer, String> digitToWord;            // simple one-to-one conversion from digit to its english word
    private static Map<Integer, String> tensToWordSimple;       // simple case for tens digits conversion
    private static Map<Integer, String> lastTwoToWordSpecial;   // special conversion for last 2 digits(10 to 19)
    
    public static void main(String[] args) 
    {
        // initialize scanner and lookup tables
        initializeVariables();
        
        boolean keepRunning = true;
        while (keepRunning)
        {
            int num = getIntInput();
            String word = convert(num);
            System.out.println("    > " + num + ": " + word);
            System.out.println("-------------------------------");
            keepRunning = askKeepRunning();
            System.out.println("-------------------------------");
        }
        System.out.println("    Program ended...\n");
    }
    
    private static String convert(int num)
    {
        // zero convertion check
        if (num == 0) return "zero";
        
        String word = new String();
        
        // Convert hundreds to english (unless it's zero)
        int hundreds = num / 100;
        if (hundreds != 0) word += digitToWord.get(hundreds) + " hundred ";
        
        int lastTwo = num % 100;
        
        boolean isLastTwoSpecial = lastTwo >= 10 && lastTwo <= 19;
        if (isLastTwoSpecial) // special conversion 
        {
            word += lastTwoToWordSpecial.get(lastTwo);
        }
        else // last 2 digits SIMPLE conversion
        {
            int tens = lastTwo / 10;
            int ones = lastTwo % 10;
            if (tens != 0) word += tensToWordSimple.get(tens);
            if (ones != 0) word += " " + digitToWord.get(ones);
        }
        
        return word;
    }
    
    private static int getIntInput()
    {
        boolean error = false;
        int num = -1;
        
        while (true) 
        {
            // error message
            if (error)
            {
                System.out.println("\n    >> Invalid Input!\n    >> Possible values allowed are from: 0 to 999\n");
            }
            
            System.out.print("    Enter number: ");
            
            // try to get input as int
            try {
                num = scanner.nextInt();
            }
            catch (InputMismatchException e) // if input can't be converted to int
            {
                scanner.nextLine(); // consume bad input but do nothing
            }
            
            // return if valid input
            if (0 <= num && num <= 999) 
            {
                return num; 
            }
            
            // else, keep looping
            error = true;
        }
    }
    
    private static boolean askKeepRunning()
    {
        System.out.print("    Type y for yes, programs quits for any other input\n    > Input again? ");
        char c = scanner.next().charAt(0);
        return c == 'y' || c == 'Y';
    }
    
    private static void initializeVariables()
    {
        scanner = new Scanner(System.in);
        digitToWord = Map.ofEntries(
            Map.entry(1, "one"),
            Map.entry(2, "two"),
            Map.entry(3, "three"),
            Map.entry(4, "four"),
            Map.entry(5, "five"),
            Map.entry(6, "six"),
            Map.entry(7, "seven"),
            Map.entry(8, "eight"),
            Map.entry(9, "nine")
        );
        tensToWordSimple = Map.ofEntries(
            Map.entry(2, "twenty"),
            Map.entry(3, "thirty"),
            Map.entry(4, "forty"),
            Map.entry(5, "fifty"),
            Map.entry(6, "sixty"),
            Map.entry(7, "seventy"),
            Map.entry(8, "eighty"),
            Map.entry(9, "ninety")
        );
        lastTwoToWordSpecial = Map.ofEntries(
            Map.entry(10, "ten"),
            Map.entry(11, "eleven"),
            Map.entry(12, "twelve"),
            Map.entry(13, "thirteen"),
            Map.entry(14, "fourteen"),
            Map.entry(15, "fifteen"),
            Map.entry(16, "sixteen"),
            Map.entry(17, "seventeen"),
            Map.entry(18, "eighteen"),
            Map.entry(19, "nineteen")
        );
    }
}
