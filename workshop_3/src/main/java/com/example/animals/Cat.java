package com.example.animals;

import com.example.interfaces.Animal;

// Cat.java
public class Cat implements Animal {
    private final String name;
    private final int age;

    
    // Constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing makeSpeak from Animal
    @Override
    public void makeSpeak() {
        System.out.println(name + " says: Meow!");
    }

    // isAdult method
    public boolean isAdult() {
        return age > 1;
    }

    // Main method for demonstration (optional)
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 2);
        myCat.makeSpeak();
        System.out.println("Is adult: " + myCat.isAdult());
    }
}
