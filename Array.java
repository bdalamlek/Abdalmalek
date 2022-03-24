import java.util.Arrays;

/**
 * Created by Timo_Sharab on 17/01/22.
 */
public class Array {
    public static void main(String[] args) {
        int x[] = {11, 12, 13, 14, 15};
        System.out.println("after reverse");
        System.out.println(Arrays.toString(reverse(x)));
    }

    public static int[] reverse(int[] a) {
        int n = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[n];
            a[n] = t;
            n--;
        }
        return a;
    }
}
