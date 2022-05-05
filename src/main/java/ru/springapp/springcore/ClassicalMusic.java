package ru.springapp.springcore;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "О фартуна.";
    }

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
}
