package handIn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//TODO: Test for exception at dequeue of empty array

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestQueue {

    @Test
    public void creationTest01(){
        Queue<Integer> queue = new Queue<Integer>();
        Assertions.assertNull(queue.getElement(0));
    }

    @Test
    public void enqueueTest01(){
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(5);
        Integer testValue = 5;
        Assertions.assertEquals(queue.getElement(0), testValue);
    }

    @Test
    public void enqueueTest02(){
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        Integer testValue = 7;
        Assertions.assertEquals(queue.getElement(6), testValue);
    }

    @Test
    public void dequeueTes01(){
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(5);
    }

}
