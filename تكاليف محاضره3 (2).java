/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class Timo3 {
    static int os(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum - (((n - 1) * n) / 2);
    }


    public static void main(String args[])
    {
        int[] arr = { 9, 8, 2, 6, 1, 9, 5, 3, 4, 7 };
        int n = arr.length;
        System.out.println(os(arr, n));
    }
}
