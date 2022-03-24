import java.util.Arrays;

/**
 * Created by Timo_Sharab on 17/01/22.
 */
public class ArrayOperation {
    public static void main(String[] args) {
        int x[]={11,12,13,14,15};
     System.out.println(Arrays.toString(x));
    //    System.out.println("after reverse");
    //    System.out.println(Arrays.toString(reverse(x)));
    //    System.out.println("after shift left");
    //    System.out.println(Arrays.toString(shirftLeft(x)));
        System.out.println("after shift left");
        System.out.println(Arrays.toString(shirftRight(x)));
    }
    public static int[] reverse(int[]a)
    {
        int n=a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;

        }
        return a;
    }
    public static int[] shirftLeft(int[]y)
    {
        int t=y[0];
        for (int i = 0; i <y.length-1 ; i++) {
            y[i]=y[i+1];
        }
        y[y.length-1]=t;
        return  y;

    }
    public static int[] shirftRight(int[]y)
    {
        int t=y[y.length-1];
        for (int i =y.length-1 ;i>0; i--) {
            y[i]=y[i-1];
        }
        y[0]=t;
        return  y;

    }
}
