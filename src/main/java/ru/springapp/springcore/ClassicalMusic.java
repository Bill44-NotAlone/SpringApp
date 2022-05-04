package ru.springapp.springcore;

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
