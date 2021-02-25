package com.company;

import java.util.function.Consumer;

public class NewClient implements NewClientInterface {

    private String name;
    private String clientCode;
    private static char charClientCodeCount = 'B';
    private static int intClientCodeCount = 1;

    public NewClient(String name) {
        this.name = name;
        setClientCode();
    }

    private void setClientCode(){

        if(charClientCodeCount <= 'Z'){
            if (intClientCodeCount >= 10000) {
                intClientCodeCount = 1;
                charClientCodeCount++;
            }
            clientCode = charClientCodeCount + String.format("%04d",intClientCodeCount++);
        } else {
            System.out.println("The maximum number of clients have been reached. A new client code configuration must be found");
        }
    }

    public String getClientCode(){
        return clientCode;
    }


}
