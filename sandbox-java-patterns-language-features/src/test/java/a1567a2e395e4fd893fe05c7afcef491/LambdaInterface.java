package a1567a2e395e4fd893fe05c7afcef491;

/**
 * The default implementation of smth.
 */
@FunctionalInterface
public interface LambdaInterface
{
    long doSomething(String str, int num);

    default int someDefaultMethod()
    {
        return 0;
    }
}
