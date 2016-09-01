package ar.fiuba.tdd.template;

/**
 * Created by cristian on 01/09/16.
 */
public class MyNullNode implements MyNodeInterface{

    public MyNullNode() {
    }

    public boolean isNull() {
        return true;
    }

    public MyNodeInterface addToNextNode(Object data) {
        return new MyValidNode(data, this);
    }

    public Object getData()  throws AssertionError {
        throw new AssertionError();
    }

    public MyNodeInterface getNext() throws AssertionError {
        throw new AssertionError();
    }

    public void setNext(MyNodeInterface nextNode) throws AssertionError {
        throw new AssertionError();
    }

    public int countNodes() {
        return 0;
    }
}
