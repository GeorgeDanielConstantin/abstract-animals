package org.lessons.java;

public class Eagle extends Animal {
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void noise() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }
}
