package com.osmel.client;

import com.osmel.stubs.BankServiceGrpc;
import com.osmel.stubs.Ebank;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BankGrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9999)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        Ebank.ConvertCurrencyRequest request = Ebank.ConvertCurrencyRequest.newBuilder()
                .setAmount(6800)
                .setCurrencyFrom("USD")
                .setCurrencyTo("EUR")
                .build();
        Ebank.ConvertCurrencyResponse currencyResponse = bankServiceBlockingStub.convert(request);
        System.out.println("Converted amount: " + currencyResponse);
    }
}
