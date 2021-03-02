package com.company.HomeCinema;

public class Television  {

    private boolean power;

    public Television() {
        this.power = false;
    }

    public void on() {
        if (power){
            System.out.println("TV already on");
        } else  {
            System.out.println("Turning TV on");
            power = true;
        }

    }

    public void off() {
        if (power){
            System.out.println("Turning TV off");
            power = false;
        } else  {
            System.out.println("TV already off");
        }
    }
}
