package ru.petrkalash.springtestapp.test2;

public class MusicPlayer {
    private Music music;
    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(Music music) {
        System.out.println("Play " + music.getSong());
    }
}