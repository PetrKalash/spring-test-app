package ru.petrkalash.springtestapp.test3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Farmer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        AnimalSound animalSound = context.getBean("animalSound", AnimalSound.class);
        animalSound.speakAnimal();
    }
}