import com.matritellabs.utama.collection.QueueImplementation;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {

    private QueueImplementation queue;

    @Before public void initialize() {
        queue = new QueueImplementation();
        queue.add(new Object());
    }

    /**
     * test add(Object e):
     *      return true;
     *      return false (expected: IllegalStateException);
     *
     *      Inserts the specified element into this queue if it is possible to do so immediately without
     *      violating capacity restrictions,returning true upon success and throwing an IllegalStateException
     *      if no space is currently available.
     */

    // Test add() if true
    @Test
    public void testAddMethod_True() {
        Object e = new Object();

        assertTrue(queue.add(e));
    }

    // Test add() if false and throwing exception
    @Test (expected = IllegalStateException.class)
    public void testAddMethod_False() {
        Object e = new Object();

        assertFalse(queue.add(e));
    }

    /**
     * test Object element():
     *      return Object;
     *      return null;
     *
     *      Retrieves, but does not remove, the head of this queue.
     */

    // test element() not null
    @Test
    public void testElementMethod_NotNull() {
        assertNotNull(queue.element());
    }

    // test element() null
    @Test (expected = NoSuchElementException.class)
    public void testElementMethod_Null() {
        QueueImplementation emptyQueue = new QueueImplementation();

        assertNull(emptyQueue.element());
    }

    /**
     * test boolean offer(Object e):
     *      return true;
     *      return false;
     *
     *      Inserts the specified element into this queue if it is possible to do so immediately without
     *      violating capacity restrictions.
     */

    // test offer() true
    @Test
    public void testOfferMethod_True() {
        Object e = new Object();
        assertTrue(queue.offer(e));
    }

    // test offer() false
    @Test
    public void testOfferMethod_False() {
        Object e = new Object();
        assertFalse(queue.offer(e));
    }

    /**
     * test Object peek():
     *      return Object;
     *      return null;
     *
     *      Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     */

    // test peek() not null
    @Test
    public void testPeekMethod_NotNull() {
        assertNotNull(queue.peek());
    }

    // test peek() null
    @Test
    public void testPeekMethod_Null() {
        QueueImplementation emptyQueue = new QueueImplementation();

        assertNull(emptyQueue.peek());
    }

    /**
     * test Object poll():
     *      return Object;
     *      return null;
     *
     *      Retrieves and removes the head of this queue, or returns null if this queue is empty.
     */

    // test poll() not null
    @Test
    public void testPollMethod_NotNull() {
        assertNotNull(queue.poll());
    }

    // test poll() null
    @Test
    public void testPollMethod_Null() {
        QueueImplementation emptyQueue = new QueueImplementation();

        assertNull(emptyQueue.poll());
    }

    /**
     * test Object remove():
     *      return Object;
     *      return null;
     *
     *      Retrieves and removes the head of this queue. Throws: NoSuchElementException - if this queue is empty
     */

    // test remove() not null
    @Test
    public void testRemoveMethod_NotNull() {
        assertNotNull(queue.remove());
    }

    // test remove() null
    @Test (expected = NoSuchElementException.class)
    public void testRemoveMethod_Null() {
        QueueImplementation emptyQueue = new QueueImplementation();

        assertNull(emptyQueue.remove());
    }

}
