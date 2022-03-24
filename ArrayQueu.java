/**
 * Created by Timo_Sharab on 02/02/22.
 */
public class ArrayQueu<E> implements
{
    final static int CAPACTY=100;
    E[] data;
    int fr=0;
    int sz=0;
    public ArrayQueu(){
        this(CAPACTY);
    }
    public ArrayQueu(int c){
        data=(E[]) new Object[c];
    }
    @Override
    public boolean isEmpty(){
        return sz==0;
    }
    public int size(){
        return sz;
    }
    @Override
    public void enqueue(E element){
        if (size()==data.length) {
            throw new IllegalStateException("Queue is full");
            int i=(fr+sz)%data.length;
            data[i]=element;
            sz++;
        }
    }
    @Override
    public E deQueue(){
        if (isEmpty())
            return null;
        E z=data[fr];
        data[fr]=null;
        fr=(fr+1)%data.length;
        sz--;
        return z;
    }
    @Override
    public E first()
    {
        if (isEmpty())
        return null;
        return data[fr];
    }

}
