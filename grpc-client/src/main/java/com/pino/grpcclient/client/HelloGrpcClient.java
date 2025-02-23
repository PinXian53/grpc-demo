package com.pino.grpcclient.client;


import com.pino.grpcinterface.generated.HelloReply;
import com.pino.grpcinterface.generated.HelloRequest;
import com.pino.grpcinterface.generated.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class HelloGrpcClient {

    @GrpcClient("hello-service")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceStub;

    public String sayHello(String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();

        HelloReply response = helloServiceStub.sayHello(request);

        return response.getMessage();
    }
}
