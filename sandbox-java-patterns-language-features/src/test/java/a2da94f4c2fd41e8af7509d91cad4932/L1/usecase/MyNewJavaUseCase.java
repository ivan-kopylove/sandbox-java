package com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.usecase;

import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJavaApi;
import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJavaApi.Result.MySuccessResult;

public class MyNewJavaUseCase implements MyNewJavaApi {


    @Override
    public Result callMe(Payload myPayload) {
        return new MySuccessResult("");
    }
}
