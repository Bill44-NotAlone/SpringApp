package ru.springapp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic music;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic){
        this.music = classicalMusic;
    }

    public Music playMusic(){
        return music;
    }
}
