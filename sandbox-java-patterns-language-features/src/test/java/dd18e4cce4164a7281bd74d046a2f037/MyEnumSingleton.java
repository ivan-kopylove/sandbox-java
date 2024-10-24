package dd18e4cce4164a7281bd74d046a2f037;

public enum MyEnumSingleton
{
    INSTANCE;

    public static final String RETURN_RESULT = "some calculated value";

    MyEnumSingleton()
    {

    }

    public String utilMethod()
    {
        return RETURN_RESULT;
    }
}
