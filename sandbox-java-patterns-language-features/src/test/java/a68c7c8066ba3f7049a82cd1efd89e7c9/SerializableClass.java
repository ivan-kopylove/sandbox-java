package a68c7c8066ba3f7049a82cd1efd89e7c9;

import java.io.Serializable;

class SerializableClass implements Serializable
{
    private static final long   serialVersionUID = 3L;
    private              String value            = "123";

    public SerializableClass(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
