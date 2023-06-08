package org.lessons.java;

public class Sparrow extends Animal {
    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void noise() {
        System.out.println("Cip");
    }

    @Override
    public void eat() {
        System.out.println("Seeds");
    }
}
