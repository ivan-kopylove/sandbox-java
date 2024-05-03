package com.github.ivan.kopylove.grpc;

//
//class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase
//{
//
//    @Override
//    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver)
//    {
//
//        String greeting = "Hello, " + request.getFirstName() + " " + request.getLastName();
//
//        HelloResponse response = HelloResponse.newBuilder()
//                                              .setGreeting(greeting)
//                                              .build();
//
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//}