package e9238d0ca14d4121a1172a90d3876db9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * The insertion, addition and removal operations of an item are faster in a LinkedList. <br/>
 * Because there is no need to resize an array or update the index.<br/>
 * Only references in surrounding elements will change.<br/>
 *
 * @see <a href="https://www.baeldung.com/java-linkedlist">https://www.baeldung.com/java-linkedlist</a>
 * @see <a href="https://stackoverflow.com/questions/393556/when-to-use-a-linked-list-over-an-array-array-list">https://stackoverflow.com/questions/393556/when-to-use-a-linked-list-over-an-array-array-list</a>
 * @see <a href="https://imgur.com/a/gmQVtBb">https://imgur.com/a/gmQVtBb</a>
 * @see <a href="https://imgur.com/a/0QEAN8O">https://imgur.com/a/0QEAN8O</a>
 */
class LinkedListExampleTest
{
    @Test
    void run()
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.addFirst("a");

        Assertions.assertEquals("a", linkedList.get(0));
        Assertions.assertEquals("b", linkedList.get(1));
        Assertions.assertEquals("c", linkedList.get(2));
        Assertions.assertEquals("d", linkedList.get(3));
    }

    @Test
    void run2()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add(0, "a");
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("b");
        linkedList.add("c");

        boolean bRemoved = linkedList.removeLastOccurrence("b");
        Assertions.assertTrue(bRemoved);

        Assertions.assertEquals("a", linkedList.get(0));
        Assertions.assertEquals("a", linkedList.get(1));
        Assertions.assertEquals("b", linkedList.get(2));
        Assertions.assertEquals("c", linkedList.get(3));
    }

    @Test
    void run3()
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("b");
        linkedList.add("c");

        String peeked = linkedList.peek();
        Assertions.assertEquals(peeked, "a");
        Assertions.assertEquals(4, linkedList.size());


        String poped = linkedList.pop();

        Assertions.assertEquals(poped, "a");
        Assertions.assertEquals(3, linkedList.size());
    }

    @Test
    void run4()
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        linkedList.poll();

        Assertions.assertEquals(2, linkedList.size());
        Assertions.assertEquals("b", linkedList.get(0));
        Assertions.assertEquals("c", linkedList.get(1));
    }
}
