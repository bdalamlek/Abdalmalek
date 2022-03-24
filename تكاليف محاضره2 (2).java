/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class Timo4 {
    public static void main(String[] args) {
        double a[] = new double[3];
        System.out.println("قيل");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("بعد");
        for (int i = 0; i <a.length ; i++) {
            double random=Math.random();
            a[i]=random;
            System.out.println(a[i]);
        }

    }
}
