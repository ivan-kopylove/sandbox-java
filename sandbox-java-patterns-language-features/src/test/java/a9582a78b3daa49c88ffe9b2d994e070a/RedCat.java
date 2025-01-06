package a9582a78b3daa49c88ffe9b2d994e070a;

class RedCat extends Cat
{
    private final String name;

    public RedCat(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
