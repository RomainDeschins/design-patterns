package com.company.HomeCinema;

public class Lights{

    private boolean power;

    public Lights() {
        this.power = false;
    }

    public void on() {
        if (power){
            System.out.println("Lights are already on");
        } else  {
            System.out.println("Turning Lights on");
            power = true;
        }
    }

    public void off() {
        if (power){
            System.out.println("Turning Lights off");
            power = false;
        } else  {
            System.out.println("Light are already off");
        }

    }
}
