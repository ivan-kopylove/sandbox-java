package heap.a31de177ed613fdd3c1f773793d601625;

class VeryBig
{
    private static final int    SIZE = 10000;
    private final        long[] la   = new long[SIZE];
    private final        String id;

    public VeryBig(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return id;
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalizing " + id);
    }
}
