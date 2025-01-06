package ac2ddbd72c1106e83b46fd0152e2c7db4;

class PrivateConstructorClass
{
    private static String value = "initial value";

    static
    {
        value = "put breakpoint here";
    }

    private String myString = "field initial value";

    private PrivateConstructorClass(String myString)
    {
        this.myString = myString;
        value = "and put breakpoint here as well";
    }

    public static PrivateConstructorClass privateConstructorClass(String myString)
    {
        return new PrivateConstructorClass(myString);
    }

    public static String getValue()
    {
        return value;
    }

    public String getMyString()
    {
        return myString;
    }
}
