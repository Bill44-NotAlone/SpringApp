package ru.springapp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );
        MusicPlayer music = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(music.playMusic().getSong());
    }
}
