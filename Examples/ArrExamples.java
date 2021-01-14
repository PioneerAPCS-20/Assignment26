
import java.util.Arrays;  // for Arrays.copyOf()

public class ArrExamples
{
    public static void main(String[] args)
    {
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
        // arr1 = Arrays.copyOf(arr2, arr2.length);  // alternate to clone()
        arr2[0] = 5;
        System.out.println(arr1[0] + ", " + arr2[0]);

    }
}
