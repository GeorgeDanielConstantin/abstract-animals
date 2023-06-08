package org.lessons.java;

public class Main {
    public static void makeFly(CanFly animal) {
        animal.fly();
    }

    public static void makeSwim(CanSwim animal) {
        animal.swim();
    }

    public static void main(String[] args) {
        Animal[] farm = new Animal[4];
        farm[0] = new Dog();
        farm[1] = new Sparrow();
        farm[2] = new Eagle();
        farm[3] = new Dolphin();

        for (Animal a : farm) {
            System.out.println("Nome animale: " + a.getClass().getSimpleName());
            a.sleep();
            a.eat();
            a.noise();
            if (a instanceof CanSwim) {
                makeSwim((CanSwim) a);
            }

            if (a instanceof CanFly) {
                makeFly((CanFly) a);
            }
        }
    }
}
