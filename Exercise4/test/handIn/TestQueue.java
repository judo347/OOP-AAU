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
        Assertions.assertEquals(testValue, queue.peak());
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

        queue.dequeue();

        Assertions.assertNull(queue.peak());
    }

    @Test
    public void dequeueTes03(){ //Exception test
        Queue<Integer> queue = new Queue<Integer>();

        try {
            queue.dequeue();
        } catch (EmptyQueueException e){
            Assertions.assertEquals("The queue is empty!", e.getErrorMsg());
        }
    }

    @Test
    public void drainTest01(){ //Drain less than number of elements
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);

        queue.drain(3);

        Integer testValue = 13;

        Assertions.assertEquals(testValue, queue.peak());
    }

    @Test
    public void drainTest02(){ //Drain empty array with 1
        Queue<Integer> queue = new Queue<Integer>();

        Assertions.assertNull(queue.drain(1));
    }

    @Test
    public void drainTest03(){ //Drain all elements
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.drain(5);

        Assertions.assertNull(queue.peak());
    }

    @Test
    public void drainTest04(){ //Drain all elements two times
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.drain(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.drain(4);

        Assertions.assertNull(queue.peak());
    }

    @Test
    public void overallTest01(){
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);

        Integer testValue = 4;

        Assertions.assertEquals(testValue, queue.dequeue());
    }
}
