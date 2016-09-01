package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.MyQueue;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by cristian on 01/09/16.
 */
public class MyQueueTests {

    @Test
    public void newQueueMustBeEmpty() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void newQueueMustHaveSizeZero() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        assertEquals(0, queue.size());
    }

    @Test
    public void queueMustNotBeEmptyAfterNewItem() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(10);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void queueMustBeEmptyAfterItemRemoved() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(10);
        queue.remove();
        assertTrue(queue.isEmpty());
    }


    @Test
    public void queueMustNotHaveSizeZeroAfterNewItem() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(10);
        assertNotEquals(0, queue.size());
    }

    @Test
    public void queueMustHaveRightSize() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(10);
        queue.add(7);
        queue.add(10);
        queue.remove();
        queue.add(15);
        assertEquals(3, queue.size());
    }

    @Test
    public void queueMustReturnSameItemThatWasAdded() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(8);
        assertEquals(8, queue.top());
    }

    @Test
    public void queueMustReturnOppositeOrder() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(8);
        queue.add(5);
        assertEquals(8, queue.top());
    }

    @Test
    public void queueMustReturnNextAfterFirstWasRemoved() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(8);
        queue.add(5);
        queue.remove();
        assertEquals(5, queue.top());
    }

    @Test
    public void queueMustReturnInOrderManyItems() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(8);
        queue.add(5);
        queue.add(25);
        assertEquals(8, queue.top());
        queue.remove();
        assertEquals(5, queue.top());
        queue.remove();
        assertEquals(25, queue.top());
    }

}
