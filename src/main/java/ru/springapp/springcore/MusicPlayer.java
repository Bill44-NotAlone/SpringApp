package ru.springapp.springcore;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public String playMusic(){
        if(music != null)
            return music.getSong();
        return "";
    }
}
