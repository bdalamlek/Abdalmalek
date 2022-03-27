/**
 * Created by Timo_Sharab on 26/03/22.
 */
public class LinkedQueue<E> implements Queue<E>{
    SinglyLIinkedList<E> list=new SinglyLIinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int Size() {
        return list.size();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFIRST();
    }

    @Override
    public E first() {
        return list.first();
    }

}
