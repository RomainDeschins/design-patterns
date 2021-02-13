package com.company.HomeCinema;

public class BluRayPlayer {

    private boolean power;

    public BluRayPlayer() {
        this.power = false;
    }

    public void on() {
        if (power){
            System.out.println("Blu-Ray Player already on");
        } else  {
            System.out.println("Turning Blu-Ray Player on, and launching the movie");
            power = true;
         }
    }

    public void off() {
        if (power){
            System.out.println("Turning Blu-Ray Player off");
            power = false;
        } else  {
            System.out.println("Blu-Ray Player already off");
        }

    }



}
