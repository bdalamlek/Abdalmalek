/**
 * Created by Timo_Sharab on 26/03/22.
 */
import java.util.Scanner;
public class TestStack {
    public static void main(String[] args) {
        LinkedStack<Integer>myStack =new LinkedStack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is the stack empty? "+myStack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i < 5; i++) {
            myStack.push(scanner.nextInt());
            System.out.println("top element is "+myStack.top());
            System.out.println("stack size "+myStack.size());
            System.out.println("Is the stack empty? "+myStack.isEmpty());

        }
        for (int i = 0; i < 6; i++) {
            System.out.println("deleted element"+myStack.pop());
            System.out.println("top element after delete is "+myStack.top());
            System.out.println("stack size "+myStack.size());
            System.out.println("Is the stack empty? "+myStack.isEmpty());

        }
    }
}
