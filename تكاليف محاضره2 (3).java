import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class Timo3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3,4,5};
        ArrayList<Integer> arr_new = new ArrayList<>();
        int f=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=f){
                arr_new.add(arr[i]);

            }
        }
        System.out.println("قبل الحذف :" + Arrays.toString(arr));
        System.out.println("بعد الحذف :" +arr_new);

    }
}
