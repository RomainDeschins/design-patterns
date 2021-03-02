package com.company;

import com.company.HomeCinema.*;

public class Main {

    public static void main(String[] args) {

        Remote remote = new Remote();

        Lights lights = new Lights();
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();
        HomeCinemaFacade facade = new HomeCinemaFacade(lights,television, soundSystem, bluRayPlayer);

        remote.setCommand(0, lights::on, lights::off);
        remote.setCommand(1, television::on, television::off);
        remote.setCommand(2, bluRayPlayer::on, bluRayPlayer::off);
        remote.setCommand(3,soundSystem::on, soundSystem::off);
        remote.setCommand(4, facade.modeCinemaOn, facade.modeCinemaOff);
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
