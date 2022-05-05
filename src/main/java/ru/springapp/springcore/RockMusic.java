package ru.springapp.springcore;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private RockMusic(){}

    @Override
    public String getSong() {
        return "Кукольный театр.";
    }

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
}
