package aedc58d97b811cc0643c11bd4102db0a6;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TreeMap sorts all its entries according to their natural ordering.<br/>
 * Complexity: O(log(n))<br/>
 *
 * @see <a href="https://i.imgur.com/Uf622Ip.png">Big O typical growth rates</a>
 * @see <a href="https://i.imgur.com/uyqWi6O.png">red-black tree</a>
 */
class TreeMapExampleTest
{
    @Test
    void default_natural_ordering()
    {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "some value");
        treeMap.put(4, "some value");
        treeMap.put(5, "some value");
        treeMap.put(1, "some value");
        treeMap.put(2, "some value");

        Iterator<Integer> iterator = treeMap.keySet()
                                            .iterator();
        assertEquals(Integer.valueOf(1), iterator.next());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertEquals(Integer.valueOf(5), iterator.next());
    }

    @Test
    void custom_order()
    {
        Map<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(1, "some value");
        treeMap.put(3, "some value");
        treeMap.put(2, "some value");
        treeMap.put(4, "some value");
        treeMap.put(5, "some value");

        Iterator<Integer> iterator = treeMap.keySet()
                                            .iterator();
        assertEquals(Integer.valueOf(5), iterator.next());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(1), iterator.next());
    }

    @Test
    void custom_order2()
    {
        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1.compareTo(o2);
            }
        });

        treeMap.put(1, "some value");
        treeMap.put(3, "some value");
        treeMap.put(2, "some value");
        treeMap.put(4, "some value");
        treeMap.put(5, "some value");

        Iterator<Integer> iterator = treeMap.keySet()
                                            .iterator();
        assertEquals(Integer.valueOf(1), iterator.next());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertEquals(Integer.valueOf(5), iterator.next());
    }
}
