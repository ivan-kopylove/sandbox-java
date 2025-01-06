package a2da94f4c2fd41e8af7509d91cad4932.L1.usecase;


import a2da94f4c2fd41e8af7509d91cad4932.L1.api.MyNewJava_Api;

public class MyNewJava_UseCase implements MyNewJava_Api {


    @Override
    public Result callMe(Payload myPayload) {
        return new Result.MySuccessResult("some result 123");
    }
}
