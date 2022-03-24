/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class Timo {
    static Integer[] intArray = {10,20,30,40,50,60,70,80,90};
    int[] o=new int[intArray.length];
    public void print (){
        System.out.println("قبل");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");
        System.out.println();

    }
    public void Switch(){
        System.out.println("بعد");
        for(int i=intArray.length-1;i>=0;i--) {
            o[i]=intArray[i];
            System.out.print(o[i] + " ");
        }
    }

    public static void main(String[] args) {
        Timo y=new Timo();
        y.print();
        y.Switch();

    }
}
