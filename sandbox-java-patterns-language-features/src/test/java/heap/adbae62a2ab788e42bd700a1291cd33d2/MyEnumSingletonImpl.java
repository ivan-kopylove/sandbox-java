package heap.adbae62a2ab788e42bd700a1291cd33d2;

/**
 * This enum will actually be compiled to something like:
 * <p/>
 * public final class MySingleton {
 * public final static MySingleton INSTANCE = new MySingleton();
 * private MySingleton(){}
 * }
 */
public enum MyEnumSingletonImpl implements MyEnumSingleton
{
    INSTANCE;

    MyEnumSingletonImpl()
    {

    }

    public String someMethod()
    {
        return "test";
    }
}
