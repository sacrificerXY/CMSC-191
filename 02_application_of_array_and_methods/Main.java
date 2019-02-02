package arrays;

public class Main 
{
    public static void main(String args[])
    {
        System.out.println("This application asks the user to input 5 numbers and store the values in an array.");
        int num[] = new int[5];
        
        AppArray1c app = new AppArray1c_Extended();
        app.readData(num);
        app.showData(num);
    }
}
