package ae350a00714a41da914085dd22b2a0d9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class IncrementalSearch
{
    private int          currentPos = 0;
    private List<MyNode> results;

    public boolean hasNext()
    {
        return results.size() > currentPos;
    }

    public Optional<MyNode> getNext()
    {
        if (results.size() > currentPos)
        {
            Optional<MyNode> myNode = Optional.ofNullable(results.get(currentPos));
            currentPos++;
            return myNode;
        }

        return Optional.empty();
    }

    public void doSearch(MyNode node, String searchExpression)
    {
        currentPos = 0;
        results = search(node, searchExpression, new ArrayList());
    }

    private List<MyNode> search(MyNode node, String searchExpression, List<MyNode> result)
    {
        if (node.hasChildren())
        {
            for (MyNode n0de : node.getChilds())
            {
                search(n0de, searchExpression, result);
            }
            return result;
        }
        else
        {
            if (node.getTitle()
                    .toLowerCase()
                    .contains(searchExpression))
            {
                result.add(node);
            }
        }

        return result;
    }
}
