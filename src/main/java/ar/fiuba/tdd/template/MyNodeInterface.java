package ar.fiuba.tdd.template;

/**
 * Created by cristian on 01/09/16.
 */
public interface MyNodeInterface {

    public Object getData();

    public boolean isNull();

    public MyNodeInterface addToNextNode(Object data);

    public MyNodeInterface getNext();

    public int countNodes();
}
