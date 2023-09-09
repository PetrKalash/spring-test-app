package ru.petrkalash.springtestapp.test3;

public class AnimalSound {
    private final Animal animal;

    public AnimalSound(Animal animal) {
        this.animal = animal;
    }

    public void speakAnimal() {
        System.out.println("This animal speak: " + animal.speak());
    }
}
