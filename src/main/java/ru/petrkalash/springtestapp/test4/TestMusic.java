package ru.petrkalash.springtestapp.test4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayerSetter", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        MusicPlayer musicPlayerFile = context.getBean("musicPlayerFile", MusicPlayer.class);
        musicPlayerFile.playMusic();
        System.out.println(musicPlayerFile.getName());
        System.out.println(musicPlayerFile.getVolume());

        context.close();
    }
}