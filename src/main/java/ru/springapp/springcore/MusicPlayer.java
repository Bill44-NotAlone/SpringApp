package ru.springapp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("musicPlayr.name")
    public String name;
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
