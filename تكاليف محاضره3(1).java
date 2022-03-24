/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class Timo2 {
    void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        Timo2 repeat = new Timo2();
        int arr[] = { 6,4, 2, 4, 5, 2, 3, 1, 1, 5, 6};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }
}
