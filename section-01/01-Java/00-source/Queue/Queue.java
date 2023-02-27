package Queue;

import java.util.LinkedList;

public class Queue<E> {
    private LinkedList<E> list; 

    public Queue(){
        this.list = new LinkedList<E>();
    }

    public void add(E element){
        list.add(element);
    }

    public E poll(){
        E element = list.getFirst();
        list.remove(0);
        return element;
    }

    public E peek(){
        return list.getFirst();
    }
}
