import com.matritellabs.utama.collection.Queue;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public abstract class QueueTest implements Queue {

//    public abstract Queue createInstance();

    @Test
    public void testMyMethod_True() {
        Object e = new Object();

        assertFalse(add(e));
    }

    @Test
    public void testElement() {
        assertNotNull(element());
    }

    @Test
    public void testOffer() {
        Object e = new Object();
        assertFalse(offer(e));
    }

    @Test
    public void testPeek() {
        Object e = new Object();
        assertEquals(e, peek());
    }

    @Test
    public void testPoll() {
        assertNotNull(poll());
    }

    @Test
    public void testRemove() {
        assertNotNull(remove());
    }



}
