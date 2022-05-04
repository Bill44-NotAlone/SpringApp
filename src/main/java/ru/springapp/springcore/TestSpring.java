package ru.springapp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = musicPlayer1 == musicPlayer2;
        System.out.println(comparison);
        musicPlayer1.setVolume(100);
        System.out.println(musicPlayer2.getVolume());
        context.close();
    }
}
