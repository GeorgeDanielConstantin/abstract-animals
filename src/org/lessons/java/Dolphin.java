package org.lessons.java;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void noise() {
        System.out.println("Keeeer");
    }

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
