package ar.fiuba.tdd.template;

/**
 * Created by cristian on 01/09/16.
 */
public class MyValidNode implements MyNodeInterface{

    private MyNodeInterface next = null;
    private Object data;

    public MyValidNode(Object dataValue, MyNodeInterface nextNode) {
        data = dataValue;
        next = nextNode;
    }

    public boolean isNull() {
        return false;
    }

    public MyNodeInterface addToNextNode(Object data) {
        next = next.addToNextNode(data);
        return this;
    }

    public Object getData()  {
        return data;
    }

    public MyNodeInterface getNext() {
        return next;
    }

    public void setNext(MyNodeInterface nextNode) {
        next = nextNode;
    }

    public int countNodes() {
        return 1 + next.countNodes();
    }
}
