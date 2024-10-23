package Practical_11;

//11. Write a java program to represent Abstract class with example.

abstract class Animal {
    public abstract void sound();  // Abstract method

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}

