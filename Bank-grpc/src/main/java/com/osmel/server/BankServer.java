package com.osmel.server;

import com.osmel.service.GrpcBankService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BankServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server= ServerBuilder.forPort(9999)
                .addService(new GrpcBankService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
