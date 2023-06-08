package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Animal[] farm = new Animal[4];
        farm[0] = new Dog();
        farm[1] = new Sparrow();
        farm[2] = new Eagle();
        farm[3] = new Dolphin();

        for (Animal a : farm) {
            a.sleep();
            a.eat();
            a.noise();
        }
    }
}
