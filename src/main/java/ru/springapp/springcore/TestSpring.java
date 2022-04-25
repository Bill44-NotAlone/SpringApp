package ru.springapp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );
        SimplestClass simplestClass =  context.getBean("SimplestClass", SimplestClass.class);

        System.out.println(simplestClass.getName());

        context.close();
    }
}
