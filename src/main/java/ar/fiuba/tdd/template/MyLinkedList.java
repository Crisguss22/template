package ar.fiuba.tdd.template;

/**
 * Created by cristian on 31/08/16.
 */
public class MyLinkedList<T> {

    private MyNodeInterface head = new MyNullNode();

    public MyLinkedList() {
    }

    public boolean isEmpty() {
        return head.isNull();
    }

    public void addItem(T data) {
        head = head.addToNextNode(data);
    }

    public Object getItem() {
        return this.head.getData();
    }

    public void removeItem() {
        head = head.getNext();
    }

    public int size() {
        return head.countNodes();
    }

}
