import java.util.Arrays;

/**
 * Created by Timo_Sharab on 24/01/22.
 */
public class RevrseArray {
    public static void main(String[] args) {
        int[]a={10,20,30,40,50};
        ArrayStack<Integer>s=new ArrayStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }
        System.out.println("after reverse usingb stack");
        System.out.println(Arrays.toString(a));
    }
}
