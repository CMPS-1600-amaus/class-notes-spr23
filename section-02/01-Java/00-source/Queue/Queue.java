import java.util.LinkedList;
public class Queue<E> {
    private LinkedList<E> list;

    public Queue(){
        list = new LinkedList<E>();
    }

    public void offer(E element){
        list.add(element);
    }

    public E poll(){
        E element = list.get(0);
        list.remove(0);
        return element;
    }

    public E peek(){
        return list.get(0);
    }
}