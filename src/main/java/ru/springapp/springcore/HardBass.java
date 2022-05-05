package ru.springapp.springcore;

import org.springframework.stereotype.Component;

@Component
public class HardBass implements Music{
    @Override
    public String getSong() {
        return "Crazy Dance";
    }
}
