package a68959c146514196a332aea363edbeb3;

public class MyNotClonableObj
{
    private final String field = "value";

    public String getField()
    {
        return field;
    }

    public Object get() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
