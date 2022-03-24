/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class Timo2 {
    static Integer[] intArray = {10,20,30,40,50,60,70,80,90};
    int[] b=new int[intArray.length];
    public void print (){
        System.out.println("قبل");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");
        System.out.println();

    }
    public void Copy(){
        System.out.println("بعد");
        for(int i=0;i<intArray.length;i++) {
            b[i]=intArray[i];
            System.out.print(b[i] + "   ");
        }
    }

    public static void main(String[] args) {
        Timo2 y=new Timo2();
        y.print();
        y.Copy();
    }
}
