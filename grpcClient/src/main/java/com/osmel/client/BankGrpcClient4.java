package com.osmel.client;

import com.osmel.stubs.BankServiceGrpc;
import com.osmel.stubs.Ebank;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcClient4 {
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
        StreamObserver<Ebank.ConvertCurrencyRequest> performStream = asyncStub
                .performStream(new StreamObserver<Ebank.ConvertCurrencyResponse>() {
                    @Override
                    public void onNext(Ebank.ConvertCurrencyResponse convertCurrencyResponse) {
                        System.out.println("*********************************");
                        System.out.println(convertCurrencyResponse);
                        System.out.println("*********************************");
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("END");
                    }
                });
        Timer timer = new Timer();
        timer.schedule(
                new TimerTask() {
                    int counter = 0;
                    @Override
                    public void run() {
                        performStream.onNext(Ebank.ConvertCurrencyRequest.newBuilder().setAmount(Math.random()*10000).build());
                        counter++;
                        System.out.println("=========> counter"+counter);
                        if(counter==10){
                            performStream.onCompleted();
                            timer.cancel();
                        }
                    }
                    }, 1000, 1000);
        System.out.println("----------------?-----------------");
        System.in.read();
    }
}
