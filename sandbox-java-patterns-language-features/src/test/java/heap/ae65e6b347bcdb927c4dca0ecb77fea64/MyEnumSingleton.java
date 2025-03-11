package heap.ae65e6b347bcdb927c4dca0ecb77fea64;

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
