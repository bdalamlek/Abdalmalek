/**
 * Created by Timo_Sharab on 26/03/22.
 */
public class DoublyLinkedList<E> {
    private Node<E>header;
    private Node<E>trailer;
    private int size;

    public DoublyLinkedList() {
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);

    }

    public boolean isEMpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if (isEMpty())return null;
        return header.getNext().getElement();
    }
    public E last()
    {
        if (isEMpty())return null;
        return trailer.getPrev().getElement();
    }

    private void addBerween(E el,Node<E>p,Node<E>n)
    {
        Node<E>newest=new Node<>(el,p,n);
        p.setNext(newest);
        n.setPrev(newest);
    }
    public void addFirst(E el)
    {
        addBerween(el,header,header.getNext());
    }
    public void addLast(E el)
    {
        addBerween(el,trailer.getPrev(),trailer);
    }
    private E remove(Node<E>x)
    {
        Node<E>p=x.getPrev();
        Node<E>n=x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getElement();
    }

    public E removeFirst()
    {
        if (isEMpty())return null;
        return remove(header.getNext());
    }
    public E removeLast()
    {
        if (isEMpty())return null;
        return remove(trailer.getPrev());
    }



    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E>next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
