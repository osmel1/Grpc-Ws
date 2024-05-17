package com.osmel.client;

import com.osmel.stubs.BankServiceGrpc;
import com.osmel.stubs.Ebank;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class BankGrpcClient2 {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9999)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel);
        Ebank.ConvertCurrencyRequest request = Ebank.ConvertCurrencyRequest.newBuilder()
                .setAmount(6800)
                .setCurrencyFrom("USD")
                .setCurrencyTo("EUR")
                .build();
        asyncStub.convert(request, new StreamObserver<Ebank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Ebank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println("*********************************");
                System.out.println("Converted amount: " + convertCurrencyResponse);
                System.out.println("*********************************");

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("End ---!");
            }
        });
        System.out.println("----------------?-----------------");
        System.in.read();
    }
}
