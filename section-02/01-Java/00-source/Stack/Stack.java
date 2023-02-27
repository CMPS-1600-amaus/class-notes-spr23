import java.util.LinkedList;
public class Stack<E> {
    private LinkedList<E> list;

    public Stack(){
        list = new LinkedList<E>();
    }

    public void push(E element){
        list.addFirst(element);
    }

    public E pop(){
        E element = list.get(0);
        list.remove(0);
        return element;
    }

    public E peek(){
        return list.get(0);
    }
}