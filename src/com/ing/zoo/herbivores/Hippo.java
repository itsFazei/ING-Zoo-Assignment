package com.ing.zoo.herbivores;

import com.ing.zoo.Animal;

/**
 * Represents a hippopotamus, a herbivorous animal.
 * Inherits basic animal behavior from class Animal
 * and defines specific hippo actions related to eating leaves and greeting.
 */
public class Hippo extends Animal implements Herbivore {

    /**
     * Constructs a new Hippo instance.
     */
    public Hippo() {
        super();
    }

    /**
     * Displays the hippo's greeting sound.
     * Prints a blue-colored splash message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[34m splash \u001B[0m \n";
        System.out.println(helloText);
    }

    /**
     * Displays the hippo's behavior when eating leaves.
     * Prints a red-colored message to simulate eating leaves.
     */
    @Override
    public void eatLeaves() {
        eatText = "\u001B[31m munch munch lovely \u001B[0m \n";
        System.out.println(eatText);
    }
}
