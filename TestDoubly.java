/**
 * Created by Timo_Sharab on 26/03/22.
 */
import java.util.Scanner;
public class TestDoubly {
    public static void main(String[] args) {
        DoublyLinkedList<String > list=new DoublyLinkedList<>();
        Scanner scanner=new Scanner(System.in);
        int choice=-1;

        System.out.println("1 add first \t 2 add last \t 3 remove first \t4 remov last \t 0 exit");
        while (choice!=0)
        {choice=scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("input first name :");
                    list.addFirst(scanner.next());
                    break;
                case 2:
                    System.out.println("input name :");
                    list.addLast(scanner.next());
                    break;
                case 3:
                    System.out.println(" name removed  :"+list.removeFirst());

                    break;
                case 4:
                    System.out.println(" name removed  :"+list.removeLast());
                    break;



            }
            System.out.println("first= "+list.first()+"\t last = "+list.last()+"\t size = "+ list.size());

        }
    }
}
