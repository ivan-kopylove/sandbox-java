package a1567a2e395e4fd893fe05c7afcef491;


class LambdaInterface2Impl implements LambdaInterface
{

    @Override
    public long doSomething(String str, int num)
    {
        return 0;
    }

    /**
     * Default method can be overridden.
     *
     * @return
     */
    @Override
    public int someDefaultMethod()
    {
        return 1;
    }
}