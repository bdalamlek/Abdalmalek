import java.util.Scanner;

/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class PrintFilesInConsole {
    public static void main(String[] args) {
        ArrayQueu<String> q=new ArrayQueu<>(3);
        Scanner in=new Scanner(System.in);
        System.out.println("input path to print file");
        for (int i = 0; i <3 ; i++) {
            q.enqueue(in.next());
        }
        while (!q.isEmpty())
            System.out.println(q.deQueue());
    }
}
