package c3d2d26e4bd544f199295ddca421ff73;

class Child extends Parent
{
    public static String getValue() // hides Parent.getValue()
    {
        return "child";
    }
}
