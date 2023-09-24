package Lab23;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayQueueTest {

    @Test
    public void testEnqueueDequeue() {
        ArrayQueue queue = new ArrayQueue();
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty());
        assertEquals(1, queue.element());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testClear() {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty());

        queue.clear();

        assertTrue(queue.isEmpty());
    }
}
