package d2307d9652884bd79433040697710475;

class MyPrivateCtorClass
{
    private static String value = "old value";

    static
    {
        value = "static initializer updated value";
    }

    private MyPrivateCtorClass()
    {
        value = "private ctor updated value";
    }

    public static String getValue()
    {
        return value;
    }
}
