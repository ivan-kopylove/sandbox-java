package heap.a8846a594a0693ccab63fe149b7f6786a;

import java.util.ArrayList;
import java.util.List;

class Parent
{
    private final List<Parent> list = new ArrayList<>();

    public List<Parent> getList()
    {
        return list;
    }

    public void addValue(Parent value)
    {
        list.add(value);
    }
}
