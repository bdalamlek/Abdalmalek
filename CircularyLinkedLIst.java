/**
 * Created by Timo_Sharab on 26/03/22.
 */
public class CircularyLinkedLIst<E> {
    private Node<E> tail=null;
    private int size=0;

    public CircularyLinkedLIst() {
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if (isEmpty())return null;
        return  tail.getNext().getElemont();
    }
    public E last()
    {
        if (isEmpty())return null;
        return  tail.getElemont();
    }
    public void addFirst(E elemant)
    {
        if (isEmpty())
        {
            tail=new Node<>(elemant,null);
            tail.setNext(tail);
        }
        else
        {
            Node<E> newest=new Node<>(elemant,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E elemant)
    {
        addFirst(elemant);
        tail=tail.getNext();
    }

    public E remobeFirst()
    {
        if (isEmpty())return null;
        Node<E> x=tail.getNext();
        if (x==tail)
        {
            tail=null;
        }
        else
        {
            tail.setNext(x.getNext());
        }
        size++;
        return x.getElemont();
    }
    public void rotate()
    {
        if (tail!=null)
            tail=tail.getNext();
    }

    private static class Node<E>
    {
        E elemont;
        Node<E>next;

        public Node(E elemont, Node<E> next) {
            this.elemont = elemont;
            this.next = next;
        }

        public E getElemont() {
            return elemont;
        }

        public void setElemont(E elemont) {
            this.elemont = elemont;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
