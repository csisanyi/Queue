import com.matritellabs.utama.collection.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
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

        assertFalse(Queue.add(e));
    }

    // Test add() if false and throwing exception
    @Test (expected = IllegalStateException.class)
    public void testAddMethod_False() {
        Object e = new Object();

        assertFalse(Queue.add(e));
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
        assertNotNull(element());
    }

    // test element() null
    @Test
    public void testElementMethod_Null() {
        assertNull(element());
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
        assertFalse(offer(e));
    }

    // test offer() false
    @Test
    public void testOfferMethod_False() {
        Object e = new Object();
        assertFalse(offer(e));
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
        assertNotNull(peek());
    }

    // test peek() null
    @Test
    public void testPeekMethod_Null() {
        assertNull(peek());
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
        assertNotNull(poll());
    }

    // test poll() null
    @Test
    public void testPollMethod_Null() {
        assertNull(poll());
    }

    /**
     * test Object remove():
     *      return Object;
     *      return null;
     *
     *      Retrieves and removes the head of this queue.
     */

    // test remove() not null
    @Test
    public void testRemoveMethod_NotNull() {
        assertNotNull(remove());
    }

    // test remove() null
    @Test
    public void testRemove_Null() {
        assertNull(remove());
    }
    
}
