package ru.springapp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1){
        this.music1 = music1;
    }

    public Music playMusic2(){
        return music2;
    }
}
