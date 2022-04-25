package ru.springapp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        System.out.println(musicPlayer.playMusic());
    }
}
