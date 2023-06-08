package org.lessons.java;

public class Sparrow extends Animal implements CanFly {
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

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
