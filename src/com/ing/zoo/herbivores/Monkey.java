package com.ing.zoo.herbivores;

import java.util.Random;

import com.ing.zoo.Animal;
import com.ing.zoo.Trick;

/**
 * Represents a monkey, a herbivorous animal that can perform tricks.
 * Inherits basic animal behavior from class Animal
 * and defines specific monkey actions and tricks.
 */
public class Monkey extends Animal implements Herbivore, Trick {

    private String trick;

    /**
     * Constructs a new Monkey instance.
     */
    public Monkey() {
        super();
    }

    /**
     * Displays the monkey's greeting sound.
     * Prints a yellow-colored "ooh ooh aah aah!" message.
     */
    @Override
    public void sayHello() {
        helloText = "\u001B[33m ooh ooh aah aah! \u001B[0m \n";
        System.out.println(helloText);
    }

    /**
     * Displays the monkey's behavior when eating leaves.
     * Prints a yellow-colored message to simulate eating bananas.
     */
    @Override
    public void eatLeaves() {
        eatText = "\u001B[33m munches on bananas \u001B[0m \n";
        System.out.println(eatText);
    }

    /**
     * Performs a random trick.
     * The monkey either swings from tree to tree or does a somersault.
     * Prints the selected trick in yellow color.
     */
    @Override
    public void performTrick() {

        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            trick = "\u001B[33m swings from tree to tree \u001B[0m \n";
        } else {
            trick = "\u001B[33m does a somersault \u001B[0m \n";
        }
        
        System.out.println(trick);
    }
}
