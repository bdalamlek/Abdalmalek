import java.util.Scanner;
public class TeatQueue {
    public static void main(String[] args) {
        ArrayQueu<Character> q=new ArrayQueu<>(5);
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <6; i++) {
            q.enqueue(input.next().charAt(0));
            System.out.println("Size "+q.size());
            System.out.println("First ="+q.first());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(q.deQueue()+"\t");
        }

    }

}
