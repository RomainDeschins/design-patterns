package com.company.HomeCinema;

public class SoundSystem {

    private boolean power;
    private int volume;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 10;

    public SoundSystem() {
        this.power = false;
    }

    public void on() {
        if (power){
            System.out.println("Sound system already on");
        } else  {
            System.out.println("Turning Dolby Atmos sound system on");
            power = true;
            volume = 5;
        }
    }

    public void off() {
        if (power){
            System.out.println("Turning Dolby Atmos sound-system off");
            power = false;
        } else  {
            System.out.println("Sound system already off");
        }
    }

    public void volumeUp(){
        if (power){
            if (volume < MAX_VOLUME){
                volume ++;
                System.out.println("Turning volume up - Volume = " + volume);
            } else {
                System.out.println("Cannot increase the volume: Maximum level already reached");
            }

        } else {
            System.out.println("Cannot increase the volume: Sound system is off");
        }
    }

    public void volumeDown(){
        if (power){
            if (volume > MIN_VOLUME){
                volume --;
                System.out.println("Turning volume down - Volume = " + volume);
            } else {
                System.out.println("Cannot decrease the volume: Minimum level already reached");
            }

        } else {
            System.out.println("Cannot increase the volume: Sound system is off");
        }
    }



}
