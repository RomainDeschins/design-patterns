package com.company;

public class ClientAdapter implements NewClientInterface {

    ClientInterface client;

    public ClientAdapter(ClientInterface client) {
        this.client = client;
    }

    @Override
    public String getClientCode() {
        return "A" +  String.format("%04d",client.getClientCode());
    }

}
