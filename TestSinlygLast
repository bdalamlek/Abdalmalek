import java.util.Scanner;

public class TestSinglyLIst {
    public static void main(String[] args) {
        SinglyLIinkedList<String> list =new SinglyLIinkedList<>();
        Scanner scanner=new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first \t 2 add last \t 3 remove first \teny key to exit");
        while (choice!=0)
        {
            System.out.println("YOur choice ");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input name");
                    list.addFirst(scanner.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(scanner.next());
                    break;
                case 3:
                    System.out.println("removed: "+list.removeFIRST());
                    break;
                case 4:
                    while (!list.isEmpty())
                    {
                        System.out.println("removed: "+list.removeFIRST());
                    }
                    break;
                default:
                        System.exit(0);
                    break;
            }
            System.out.println("first = "+list.first()+"\tlast = "+ list.last()+"\t size = "+list.size());

        }
    }
}
