/**
 * Created by Timo_Sharab on 26/03/22.
 */
public class LinkedStack<E>implements Stack<E> {
    SinglyLIinkedList<E>list=new SinglyLIinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        return list.removeFIRST();
    }

    @Override
    public E top() {
        return list.first();
    }
}
