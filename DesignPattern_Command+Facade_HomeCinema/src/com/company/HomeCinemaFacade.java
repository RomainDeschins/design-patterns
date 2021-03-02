package com.company;

import com.company.HomeCinema.*;

public class HomeCinemaFacade {
    Lights lights = new Lights();
    Television television = new Television();
    SoundSystem soundSystem = new SoundSystem();
    BluRayPlayer bluRayPlayer = new BluRayPlayer();

    public HomeCinemaFacade(Lights lights,
                            Television television,
                            SoundSystem soundSystem,
                            BluRayPlayer bluRayPlayer) {
        this.lights = lights;
        this.television = television;
        this.soundSystem = soundSystem;
        this.bluRayPlayer = bluRayPlayer;
    }

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


}
