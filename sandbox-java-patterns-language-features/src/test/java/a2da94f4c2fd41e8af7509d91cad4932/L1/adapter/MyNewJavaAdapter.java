package com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.adapter;


import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJavaApi;
import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.spi.MyNewJavaSpi;

public class MyNewJavaAdapter implements MyNewJavaSpi, MyNewJavaApi.Result.ResultAdapter<String> {

    private final MyNewJavaApi myApi;

    public MyNewJavaAdapter(MyNewJavaApi myApi) {

        this.myApi = myApi;
    }

    @Override
    public String callMe(Payload myPayload) {
        MyNewJavaApi.Result wrappedResult = myApi.callMe(new MyNewJavaApi.Payload(myPayload.myPayload()));

        String result = wrappedResult.adapt(this);

        return result;
    }

    @Override
    public String onSuccess(MyNewJavaApi.Result.MySuccessResult result) {
        return result.myResultField();
    }

    @Override
    public String onFailure(MyNewJavaApi.Result.MyFailureResult result) {
        return "";
    }
}
