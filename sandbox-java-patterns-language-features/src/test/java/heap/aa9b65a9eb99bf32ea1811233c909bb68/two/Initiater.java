package heap.aa9b65a9eb99bf32ea1811233c909bb68.two;

import java.util.ArrayList;
import java.util.List;

// Someone who says "Hello"
class Initiater
{
    private final List<HelloListener> listeners = new ArrayList<>();

    public void addListener(HelloListener toAdd)
    {
        listeners.add(toAdd);
    }

    public void sayHello()
    {
        System.out.println("Hello!!");

        // Notify everybody that may be interested.
        for (HelloListener hl : listeners)
        {
            hl.someoneSaidHello();
        }
    }
}