package e5e6045791054b6fa9dd017be89ac930;

/**
 * This enum will actually be compiled to something like:
 * <p/>
 * public final class MySingleton {
 * public final static MySingleton INSTANCE = new MySingleton();
 * private MySingleton(){}
 * }
 *
 * 
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
