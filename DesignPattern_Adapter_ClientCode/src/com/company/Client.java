package com.company;

public class Client implements ClientInterface {

    private String name;
    private int clientCode;
    private static int clientCodeCount = 1;

    public Client(String name) {
        this.name = name;
        setClientCode();
    }

    private void setClientCode(){
        if (clientCodeCount <= 9999)
            this.clientCode = clientCodeCount++;
    }

    public int getClientCode(){
        if (clientCode == 0){
            System.out.println("The maximum number of clients have been reached. A new client code configuration must be found.");
        }
            return clientCode;
    }


}
