package ru.springapp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );
        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music.getSong());
    }
}
