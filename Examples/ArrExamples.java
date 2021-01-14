
import java.util.Arrays;  // for Arrays.copyOf()

public class ArrExamples
{
    public static void main(String[] args)
    {
        double[] scores = new double[4];
        scores[0] = 75.5;
        scores[1] = 83.8;
        scores[2] = 99.7;
        scores[3] = 88.1;
        
        // Sum of values
        double sum = 0;
        for(int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }

        System.out.println("Sum = " + sum);
        
        double mean = sum / scores.length;
        System.out.println("Mean = " + mean);


        // Quirks

        copy();
        actualCopy();

        int[] vals = {2, 3, 4};
        change(vals);
        System.out.println(vals[0]);
    }

    public static void change(int[] arr)
    {
        arr[0] = 22;
    }

    public static void copy()
    {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {-3, -2, -1};
        arr1 = arr2;
        arr2[0] = 5;
        System.out.println(arr1[0] + ", " + arr2[0]);
    }

    public static void actualCopy()
    {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {-3, -2, -1};
        arr1 = arr2.clone();
        // arr1 = Arrays.copyOf(arr2, arr2.length);  // alternative to clone()
        arr2[0] = 5;
        System.out.println(arr1[0] + ", " + arr2[0]);

    }
}
