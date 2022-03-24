import java.util.Scanner;

/**
 * Created by Timo_Sharab on 24/01/22.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer> MyStack=new ArrayStack<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println(" is the Stack"+MyStack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i <5 ; i++) {
            MyStack.push(in.nextInt());
            System.out.println("top elements ="+MyStack.top());
            System.out.println("size="+MyStack.size());
            System.out.println("is the stack empty?"+MyStack.isEmpty());
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("deleted element="+MyStack.pop());
            System.out.println("top elements after deleted ="+MyStack.top());
            System.out.println("size="+MyStack.size());
            System.out.println("is the stack empty?"+MyStack.isEmpty());
        }
    }
}
