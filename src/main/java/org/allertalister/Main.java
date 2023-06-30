package org.allertalister;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max","chow");

        myDog.sound(4);

        System.out.printf(myDog.getName());
    }
}