package com.company;

import com.company.HomeCinema.*;

public class Main {

    public static void main(String[] args) {

        Remote remote = new Remote();

        Lights lights = new Lights();
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();

        remote.setCommand(0, lights::on, lights::off);
        remote.setCommand(1, television::on, television::off);
        remote.setCommand(2, bluRayPlayer::on, bluRayPlayer::off);
        remote.setCommand(3,soundSystem::on, soundSystem::off);

        Command modeCinemaOn = ()->{
            System.out.println("Launching a Movie - Turning on the home cinema");
            lights.off();
            television.on();
            soundSystem.on();
            bluRayPlayer.on();
        };

        Command modeCinemaOff = ()->{
            System.out.println("End of the movie - Turning off the home cinema");
            lights.on();
            bluRayPlayer.off();
            soundSystem.off();
            television.off();
        };

        remote.setCommand(4, modeCinemaOn, modeCinemaOff);
        remote.setCommand(5, soundSystem::volumeUp, soundSystem::volumeDown);

        remote.pushOn(0);
        remote.pushOn(4);
        remote.pushOn(5);
        remote.pushOn(5);
        remote.pushOn(5);
        remote.pushOn(5);
        remote.pushOn(5);
        remote.pushOn(5);
        remote.pushOff(4);


    }
}
