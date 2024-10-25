package a3c58f9454de01b0476a10eac35ad8515;

class MyNotClonableObj
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
