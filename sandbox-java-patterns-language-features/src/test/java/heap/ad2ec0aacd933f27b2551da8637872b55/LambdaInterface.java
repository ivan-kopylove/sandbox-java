package heap.ad2ec0aacd933f27b2551da8637872b55;


@FunctionalInterface
public interface LambdaInterface
{
    long doSomething(String str, int num);

    default int someDefaultMethod()
    {
        return 0;
    }
}
