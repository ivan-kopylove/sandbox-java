package heap.a7bbead4948debd5a3354f79fae60715c;

class LazySingleton
{
    private static LazySingleton INSTANCE = null;

    private LazySingleton()
    {
    }

    public static LazySingleton getInstance()
    {
        if (INSTANCE == null)
        {
            System.out.println("INSTANCE == null");
            synchronized (LazySingleton.class)
            {
                System.out.println("INSTANCE == null");

                if (INSTANCE == null)
                {
                    System.out.println("INSTANCE == null 2");
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}