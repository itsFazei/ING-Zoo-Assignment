package com.ing.zoo.carnivores;

import com.ing.zoo.Animal;

/**
 * Represents a lion, which is a carnivorous animal.
 * Inherits basic animal behavior from class Animal
 * and defines specific lion actions.
 */
public class Lion extends Animal implements Carnivore {

    /**
     * Constructs a new Lion instance.
     */
    public Lion() {
        super();
    }

    /**
     * Displays the lion's behavior when eating meat.
     * Prints a red-colored message to simulate eating.
     */
    @Override
    public void eatMeat() {
        eatText = "\u001B[31m nomnomnom thx mate \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Displays the lion's greeting sound.
     * Prints a yellow-colored roar message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[33m roooaoaaaaar \u001B[0m \n";
        System.out.println(helloText);
    }
}
