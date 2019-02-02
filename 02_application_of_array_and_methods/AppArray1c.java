package arrays;

import static java.lang.System.out;
import java.util.*;

/* 
The contents of this class is restructured to allow the demonstration of
OOP concepts. The static main method of this class is moved to Main.java
The methods showData and readData are no longer static so that they can be
overriden in the derived classes(java doesn't allow extension of static methods)
*/
public class AppArray1c 
{
    public void showData(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            out.println("value = " + arr[i]);
        }
    }
    public void readData(int arr[])
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            out.print("Input an integer: ");
            arr[i] = input.nextInt();
        }
    }
}
