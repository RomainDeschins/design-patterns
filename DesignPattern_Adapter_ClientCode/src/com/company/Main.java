package com.company;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<NewClientInterface> NewClientChecker = x -> {
            if (x.getClientCode().matches("[A-Z][0-9][0-9][0-9][0-9]")){
                System.out.println("Valid Client");
            } else {
                System.out.println("Not valid client");
            }
        };

        for (int i = 1; i < 10010; i++){
            ClientInterface myClient = new Client("Jenny");
            NewClientInterface myAdaptedClient = new ClientAdapter(myClient);
            System.out.println(myAdaptedClient.getClientCode());
            NewClientChecker.accept(myAdaptedClient);
        }

        for(int i = 1; i < 40000; i++){
            NewClientInterface myNewClient = new NewClient("New Client");
            System.out.println(myNewClient.getClientCode());
            NewClientChecker.accept(myNewClient);
        }

    }
}
