package org.lessons.java;

public class Dog extends Animal implements CanSwim {
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void noise() {
        System.out.println("Bau");
    }

    @Override
    public void eat() {
        System.out.println("Treats");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
