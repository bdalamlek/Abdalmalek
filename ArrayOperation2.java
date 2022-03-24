import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Timo_Sharab on 17/01/22.
 */
public class ArrayOperation2 {
    int x[];
    int numoffElements;

    public ArrayOperation2() {
        x = new int[5];
        numoffElements = 0;
    }

    public int add(int e) {
        if (numoffElements < x.length) {
            x[numoffElements] = e;
            numoffElements++;
            return 0;
        }
        return -1;
    }

    public int addSortedElement(int e) {
        if (numoffElements < x.length) {
            int i = numoffElements;
            while (i > 0 && e < x[i - 1]) {
                x[i] = x[i - 1];
                i--;
            }
            x[i] = e;
            numoffElements++;
            return 0;
        }
        return -1;
    }

}
    public int delete()
    {
        if (numoffElements>0)
        {
            x[numoffElements-1]=-1;
            numoffElements--;
            return 0;
        }
        return -1;
    }


    public static void main(String[] args) {
        ArrayOperation2 test =new ArrayOperation2();
        Scanner in =new Scanner(System.in);
        System.out.println("input element");
        for (int i = 0; i <7 ; i++) {
            if (test.addSortedElement(in.nextInt())==0)
                System.out.println("added sucessfuly");
                else
                System.out.println("array is fully");
            System.out.println(Arrays.toString(test.x));
            }
        for (int i = 0; i <7 ; i++) {

                    }

        }
}
/*   public static void main(String[] args) {
        ArrayOperation2 test =new ArrayOperation2();
        Scanner in =new Scanner(System.in);
        System.out.println("input element");
        for (int i = 0; i <7 ; i++) {
            if (test.addSortedElement(in.nextInt())==0)
                System.out.println("added sucessfuly");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));

        }
    }
}*/

