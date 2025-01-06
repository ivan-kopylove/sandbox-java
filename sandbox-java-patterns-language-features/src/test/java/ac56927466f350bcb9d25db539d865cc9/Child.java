package ac56927466f350bcb9d25db539d865cc9;

class Child extends Parent
{
    public static String getValue() // hides Parent.getValue()
    {
        return "child";
    }
}
