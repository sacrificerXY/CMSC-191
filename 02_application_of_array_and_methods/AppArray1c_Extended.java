package arrays;

public class AppArray1c_Extended extends AppArray1c 
{
    @Override
    public void showData(int x[])
    {
        System.out.println("---- Inputs ----");
        super.showData(x);
        System.out.println("----------------");
        System.out.println("Largest:   " + getMaximum(x));
        System.out.println("Smallest:  " + getMinimum(x));
        System.out.println("Average:   " + getAverage(x));
        System.out.println("Std Dev:   " + getStandardDeviation(x));
    }
    
    public int getMaximum(int arr[])
    {
        if (arr.length == 0) return 0;
        int max = Integer.MAX_VALUE;
        for (int num : arr) max = num < max ? num : max;
        return max;
    }
    
    public int getMinimum(int arr[])
    {
        if (arr.length == 0) return 0;
        int min = Integer.MIN_VALUE;
        for (int num : arr) min = num < min ? min : num;
        return min;
    }
    
    public double getAverage(int arr[])
    {
        if (arr.length == 0) return 0;
        double total = 0;
        for (int num : arr) total += num;
        return total / arr.length;
    }
    
    public double getStandardDeviation(int arr[])
    {
        if (arr.length == 0) return 0;
        double mean = getAverage(arr);
        double meanSquareError = 0;
        for (int num : arr) meanSquareError += Math.pow(num-mean, 2);
        double variance = meanSquareError / arr.length;
        return Math.sqrt(variance);
    }
}
