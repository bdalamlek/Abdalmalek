public class SinglyLIinkedList<E>{


    private  Node<E> head=null;
    private Node<E>tail= null;
    private int size=0;

    public SinglyLIinkedList() {
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public E first()
    {
        if(isEmpty())return null;
        return head.getElement();
    }
    public E last()
    {
        if(isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E ex)
    {
        head=new Node<>(ex,head);
        if (isEmpty())
            tail=head;
         size++;

    }
    public E removeFIRST()//للحذف من الاول اما للحذف من الاخير  فمن الافضل استخدام Duble linked list
    {
        if (isEmpty())return null;
        E del= head.getElement();
        head=head.getNext();
        size--;
        if (isEmpty())
            tail=null;
        return del;
    }
    public void addLast(E ex)
    {
        Node<E> newest=new Node<>(ex,null);
        if (isEmpty())
            head=newest; //في الحالات الخاصه اذا كانت القائمه فارغه
        else
            tail.setNext(newest);//اذا كانت القائمه تحتوي على node على الاقل

        tail=newest;
        size++;

    }

    private static class Node<E>
    {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
