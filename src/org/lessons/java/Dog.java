package org.lessons.java;

public class Dog extends Animal {
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
}
