package ru.springapp.springcore;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private Music music;
    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public List<String> playPlaylist(){
        List<String> arraymusic = new ArrayList<>();
        musicList.forEach(music -> {
            this.music = music;
            arraymusic.add(playMusic());
        });
        return arraymusic;
    }

    public String playMusic(){
        if(music != null)
            return music.getSong();
        return "";
    }
}
