package a2da94f4c2fd41e8af7509d91cad4932.L1.adapter;


import a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJava_Api;
import a2da94f4c2fd41e8af7509d91cad4932.L1.spi.MyNewJava_Spi;

public class MyNewJava_Adapter implements MyNewJava_Spi, MyNewJava_Api.Result.ResultAdapter<String> {

    private final MyNewJava_Api myApi;

    public MyNewJava_Adapter(MyNewJava_Api myApi) {

        this.myApi = myApi;
    }

    @Override
    public String callMe(Payload myPayload) {
        MyNewJava_Api.Result wrappedResult = myApi.callMe(new MyNewJava_Api.Payload(myPayload.myPayload()));

        String result = wrappedResult.adapt(this);

        return result;
    }

    @Override
    public String onSuccess(MyNewJava_Api.Result.MySuccessResult result) {
        return result.myResultField();
    }

    @Override
    public String onFailure(MyNewJava_Api.Result.MyFailureResult result) {
        return "";
    }
}
