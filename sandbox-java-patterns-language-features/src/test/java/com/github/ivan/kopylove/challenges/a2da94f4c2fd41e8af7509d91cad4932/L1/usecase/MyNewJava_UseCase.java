package com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.usecase;

import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJava_Api;
import com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJava_Api.Result.MySuccessResult;

public class MyNewJava_UseCase implements MyNewJava_Api {

    @Override
    public Result callMe() {
        return new MySuccessResult("");
    }
}
