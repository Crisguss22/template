package ar.fiuba.tdd.template;

/**
 * Created by cristian on 01/09/16.
 */
public class MyQueue<T> {

    private MyLinkedList<T>  list = new MyLinkedList<T>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(T data) {
        list.addItem(data);
    }

    public Object top() {
        return list.getItem();
    }

    public void remove() {
        list.removeItem();
    }

    public int size() {
        return list.size();
    }
}
