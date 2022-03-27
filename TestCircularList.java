/**
 * Created by Timo_Sharab on 26/03/22.
 */
import java.util.Scanner;
public class TestCircularList {
    public static void main(String[] args) {
        CircularyLinkedLIst<String>list=new CircularyLinkedLIst<>();
        Scanner scanner=new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first \t 2 add last \t 3 remove first ]t4 rotate \t 0 exit");
        scanner.next();
        while (choice!=0)
        {
            switch (choice) {
                case 1:
                    System.out.println("input name :");
                    list.addFirst(scanner.next());
                    break;
                case 2:
                    System.out.println("input name :");
                    list.addLast(scanner.next());
                    break;
                case 3:
                    System.out.println(" name removed  :"+list.remobeFirst());

                    break;
                case 4:
                    list.rotate();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
