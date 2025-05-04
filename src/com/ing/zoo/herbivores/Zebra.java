package com.ing.zoo.herbivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;

/**
 * Represents a zebra, a herbivorous animal that can perform tricks.
 * Inherits basic animal behavior from class Animal
 * and defines specific zebra actions and tricks.
 */
public class Zebra extends Animal implements Herbivore, Trick {

    public String trick;

    /**
     * Constructs a new Zebra instance.
     */
    public Zebra() {
        super();
    }

    /**
     * Displays the zebra's greeting sound.
     * Prints a cyan-colored "zebra zebra" message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[36m zebra zebra \u001B[0m \n";
        System.out.println(helloText);
    }

    /**
     * Displays the zebra's behavior when eating leaves.
     * Prints a cyan-colored message to simulate eating.
     */
    @Override
    public void eatLeaves() {
        eatText = "\u001B[36m munch munch zank yee bra \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Performs a random trick.
     * The zebra either jumps through rings of fire or performs a salto.
     * Prints the selected trick in cyan color.
     */
    @Override
    public void performTrick() {

        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            trick = "\u001B[36m jump through the rings of fire \u001B[0m \n";
        } else {
            trick = "\u001B[36m performs a salto \u001B[0m \n";
        }
        
        System.out.println(trick);
    }
}
