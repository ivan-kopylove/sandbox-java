package a2da94f4c2fd41e8af7509d91cad4932.L1.api;

@FunctionalInterface
public interface MyNewJava_Api {
    Result callMe(Payload myPayload);

    record Payload(String myPayload) {
    }

    interface Result {

        <T> T adapt(ResultAdapter<T> resultAdapter);

        interface ResultAdapter<T> {

            T onSuccess(MySuccessResult result);

            T onFailure(MyFailureResult result);

        }

        record MySuccessResult(String myResultField) implements Result {

            @Override
            public <T> T adapt(ResultAdapter<T> resultAdapter) {
                return resultAdapter.onSuccess(this);
            }
        }

        record MyFailureResult(String myResultField) implements Result {

            @Override
            public <T> T adapt(ResultAdapter<T> resultAdapter) {
                return resultAdapter.onFailure(this);
            }
        }

    }
}
